
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

    static int iteradorImg = 0;
    static int c = 0;
    private static String host = "localhost";
    private static int port = 9000;

    public static void main(String[] args) {

        try {
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
                        SocketChannel cl = server.accept();
                        cl.configureBlocking(false);
                        cl.register(selector, SelectionKey.OP_WRITE);
                        System.out.println("Un cliente se conectó");
                        key.attach(cl);
                    } else if (key.isWritable()) {
                        SocketChannel ch = (SocketChannel) key.channel();
                        try {
                            if (iteradorImg < 21) {
                                String nombreImg = "" + String.valueOf(iteradorImg);
                                Path newPath = Paths.get("/Users/rekoncarloz/Desktop/cartasServer/" + nombreImg + ".jpg");
                                System.out.println(newPath);
                                FileChannel inChannel = FileChannel.open(newPath);

                                //Envio del tam de imagen
                                long espera = inChannel.size();
                                byte[] fileTam = String.valueOf(espera).getBytes();
                                ByteBuffer buff = ByteBuffer.wrap(fileTam);
                                buff.clear();
                                ch.write(buff);

                                //Envio de la imagen
                                ByteBuffer buffer = ByteBuffer.allocate(1024);
                                buffer.clear();
                                System.out.println(inChannel.size());
                                while (inChannel.read(buffer) > 0 || c<inChannel.size()) {
                                    c++;
                                    buffer.flip();
                                    ch.write(buffer);
                                    buffer.compact();
                                }
                                inChannel.close();
                                ++iteradorImg;
                            }

                        } catch (IOException ex) {

                        }

                    }
                }
            }
        } //main
        catch (IOException ex) {
            Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
