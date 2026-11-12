import java.net.*;
import java.io.*;
import java.util.*;

public class Client{
    public static void main(String[] args)throws Exception{
        Socket s=new Socket("localhost",5000);

        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Book id or Title ; ");
        String book=sc.nextLine();
        dos.writeUTF(book);

        String result=dis.readUTF();
        System.out.println("Result : ");
        System.out.println(result);
        
        s.close();

    }
}