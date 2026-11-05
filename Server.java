/* remove the Space from sentence*/
import java.net.*;

public class Server{
    public static void main (String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket(1234);
        byte[] b=new byte[1024];

        DatagramPacket p=new DatagramPacket(
            b,
            b.length
        );

        ds.receive(p);
        String s=new String(p.getData(),0,p.getLength());
        s=s.replace(" ","");

        b=s.getBytes();
        ds.send(new DatagramPacket(
            b,
            b.length,
            p.getAddress(),
            p.getPort()
        ));
        ds.close();
    }
}