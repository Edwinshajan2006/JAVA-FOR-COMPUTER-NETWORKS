import java.io.*;
import java.util.*;
import java.net.*;

public class Server{
    public static void main(String[] args)throws Exception{
        DatagramSocket ds=new DatagramSocket(1234);
        byte[] b=new byte[1024];
        DatagramPacket p=new DatagramPacket(
            b,
            b.length
        );
        ds.receive(p);
        String s=new String(p.getData(),0,p.getLength());
        switch(s.toUpperCase()){
            case "WWW":
                s="World Wide Web";
                break;
            case "URL" :
                s="Universal Resourece Locator ";
                break;
            case "HTML":
                s="HyperText Transfer Protocol";
                break;
            case "XMl":
                s="Extensible Markup Language";
                break;
            case "ISP":
                s="Internet Service Provider";
                break;
            default:
                s="No Data Found 404";
        }
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
