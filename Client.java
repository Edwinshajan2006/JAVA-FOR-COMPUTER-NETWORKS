import java.util.*;
import java.net.*;

public class Client{
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input : ");
        String msg=sc.nextLine();
        byte[] b=msg.getBytes();
        InetAddress ip=InetAddress.getLocalHost();
        ds.send(new DatagramPacket(
            b,
            b.length,
            ip,
            1234
        ));
        b=new byte[1024];
        DatagramPacket p=new DatagramPacket(b,b.length);
        ds.receive(p);
        System.out.println("Result ; "+new String (
            p.getData(),
            0,
            p.getLength()
        ));
        ds.close();
    }
}