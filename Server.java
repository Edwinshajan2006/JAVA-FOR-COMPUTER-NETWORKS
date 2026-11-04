//count occurence of a letter

import java.net.*;
public class Server{
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket (1234);
        byte[] b=new byte[1024];
        DatagramPacket p=new DatagramPacket(b,b.length);
        ds.receive(p);
        String s=new String(p.getData(),0,p.getLength());
        String[] a= s.split(" ");
        int  count=0;
        for (char c:a[0].toCharArray())
        if(c==a[1].charAt(0))count++;
        b=String.valueOf(count).getBytes();
        ds.send(new DatagramPacket(b,b.length,p.getAddress(),p.getPort()));
        ds.close();
    }
}