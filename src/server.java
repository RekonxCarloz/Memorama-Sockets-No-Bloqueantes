
import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class server {

    
    private static String host = "localhost";
    private static int port = 9000;
    private static boolean pet = false;

    public static void main(String[] args) {

        try {
            int iteradorImg = 0;
            Selector selector = Selector.open();
            ServerSocketChannel server = ServerSocketChannel.open();
            server.configureBlocking(false);
            server.bind(new InetSocketAddress(9000));
            server.register(selector, SelectionKey.OP_ACCEPT);

            while (true) {
                selector.select();
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                while (iterator.hasNext()) {
                    SelectionKey key = iterator.next();
                    iterator.remove();

                    if (key.isAcceptable()) {
                        //El selector solo avisa ya es cuestion nuestra hacer el accept
                        SocketChannel cl = server.accept();
                        System.out.println("Cliente conectado desde" + cl.socket().getInetAddress() + ":" + cl.socket().getPort()); //Tomo el puert
                        System.out.println("Se procedera a enviarle todas las fotos! ");
                        //Se hace el socket no bloqueante para que entren mas clientes
                        cl.configureBlocking(false);
                        
                        // como el cliente tiene su propio socket chanel se vincula su socket chanel al register de aqui
                        // en este caso se hace al de lectura y escritura.
                        cl.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                        continue;
                    }//if
                    //Lectura el cliente escirbio algo en mi buffer
                    if (key.isReadable()) {
                        try {
                            //Nos interesa saber que canal fue el que lo hizo
                            SocketChannel ch = (SocketChannel) key.channel();
//                            Se creea un buffer como intermediario
                            ByteBuffer b = ByteBuffer.allocate(2000);
                            b.clear();
                            int n = 0;
                            String msj = "";
                            n = ch.read(b);
//                            Ajusta mi buffer ára trabajar con el
                            b.flip();
                            if (n > 0) {
                                msj = new String(b.array(), 0, n);
                            }
                            System.out.println("Mensaje de " + n + " bytes recibido:" + msj);

                            if (msj.equals("solImagenes")) {

                                pet = true;

                                key.interestOps(SelectionKey.OP_WRITE);
                                msj = "";

                            }

                        } catch (IOException e) {

                        }
                    } else if (key.isWritable()) { //Mi socketchanel esta listo para escribir algo y se envie
                        SocketChannel ch = (SocketChannel) key.channel();

                        try {
                            if (pet) {
                                if (iteradorImg < 21) {
                                    String nombreImg = "" + String.valueOf(iteradorImg);
                                    Path newPath = Paths.get("/Users/rekoncarloz/Desktop/cartasServer/" + nombreImg + ".jpg");
                                    System.out.println(newPath);
                                    FileChannel inChannel = FileChannel.open(newPath);

                                    //Envio del tam de imagen
                                    long espera = inChannel.size();
                                    byte[] envio = String.valueOf(espera).getBytes();
                                    ByteBuffer b2 = ByteBuffer.wrap(envio);
                                    ch.write(b2);

                                    //Envio de la imagen
                                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                                    buffer.clear();
                                    int c = 0;
                                    while (inChannel.read(buffer) > 0 || c < inChannel.size()) {
                                        c++;
                                        buffer.flip();
                                        ch.write(buffer);
                                        buffer.compact();

                                    }
                                    inChannel.close();
                                    if (iteradorImg == 20) {
                                        pet = false;
                                    }
                                    ++iteradorImg;
                                }
                            }
                        } //main
                        catch (IOException e) {

                        }
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
