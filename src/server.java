
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
                        cl.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
                        System.out.println("isAcceptable");
                        key.attach(cl);
                        continue;
                    } else {
                        if (key.isWritable()) {
                            System.out.println("Conexion de escritura");
                            SocketChannel cl2 = (SocketChannel) key.channel();
                            File[] cartas = new File("/Users/rekoncarloz/Desktop/cartasServer").listFiles();
                            for (int i = 0; i <= cartas.length; i++) {
                                try {
                                    String fileName = cartas[i].getName();
                                    byte[] nameBytes = fileName.getBytes("UTF-8");
                                    ByteBuffer nameBuffer = ByteBuffer.wrap(nameBytes);
                                    cl2.write(nameBuffer);
                                    int bufferSize = 10240;
                                    Path path = Paths.get(cartas[i].getAbsolutePath());
                                    FileChannel fileChannel = FileChannel.open(path);
                                    ByteBuffer buff = ByteBuffer.allocate(bufferSize);
                                    int noOfBytesRead = 0;
                                    int counter = 1;
                                    do {
                                        noOfBytesRead = fileChannel.read(buff);
                                        if (noOfBytesRead <= 0) {
                                            break;
                                        }
                                        counter += noOfBytesRead;
                                        buff.flip();
                                        do {
                                            noOfBytesRead -= cl2.write(buff);
                                        } while (noOfBytesRead > 0);
                                        buff.clear();
                                    } while (true);
                                    fileChannel.close();
                                    System.out.println("Imagen " + i + " Enviada");

                                } catch (IOException ex) {
                                    Logger.getLogger(server.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                            cl2.close();
                            return;
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
