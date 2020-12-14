import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

public class server {
    public static void main(String[] args){
        try{
            File[] cartas = new File("/Users/rekoncarloz/Desktop/cartasServer").listFiles();
            
            String EECO="";
            int pto=9000;
            ServerSocketChannel s = ServerSocketChannel.open();
            s.configureBlocking(false);
            s.socket().bind(new InetSocketAddress(pto));
            System.out.println("Esperando jugadores...");
            Selector sel = Selector.open();
            s.register(sel, SelectionKey.OP_ACCEPT);
            while(true){
                sel.select();
                Iterator<SelectionKey>it = sel.selectedKeys().iterator();
                while(it.hasNext()){
                    SelectionKey k = (SelectionKey)it.next();
                    it.remove();
                    if(k.isAcceptable()){
                        SocketChannel cl = s.accept();
                        System.out.println("Cliente conectado desde" + cl.socket().getInetAddress() + ":" + cl.socket().getPort());
                        System.out.println("Mandando cartas...");
                        
                        
                        for(int i = 0; i<cartas.length; i++){
                            
                        }
                        
                        cl.configureBlocking(false);
                        cl.register(sel,SelectionKey.OP_READ|SelectionKey.OP_WRITE);
                        continue;
                    }//if
                    if(k.isReadable()){
                        try{
                            SocketChannel ch = (SocketChannel)k.channel();
                            ByteBuffer b = ByteBuffer.allocate(2000);
                            b.clear();
                            int n=0; 
                            String msj="";
                            n=ch.read(b);
                            b.flip();
                            if (msj.equalsIgnoreCase("SALIR")){
                                k.interestOps(SelectionKey.OP_WRITE);
                                ch.close();
                            }
                        }catch(IOException io){}
                        continue;
                    }
                }//while
            }//while
        }catch(Exception e){
            e.printStackTrace();
        }//catch
    }//main
}
