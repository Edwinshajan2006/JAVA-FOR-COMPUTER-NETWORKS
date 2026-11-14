import java.io.*;
import java.net.*;
import java.util.*;

public class Client{
    public static void main (String[] args)throws Exception{
        Socket s=new Socket("localhost",5000);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the file name :");
        String name=sc.nextLine();
        dos.writeUTF(name);
        String result=dis.readUTF();
        System.out.println(result);
        s.close();

    }
}