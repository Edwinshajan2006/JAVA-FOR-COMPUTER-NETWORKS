import java.io.*;
import java.net.*;
import java.util.*;

public class Client{
    public static void main(String[] args)throws Exception{
        Socket s=new Socket("localhost",5000);
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        Scanner sc=new Scanner(System.in);
        Random r=new Random();

        System.out.println("Enter the Matrix Size : \n");
        int n=sc.nextInt();

        int a[][]=new int[n][n];
        System.out.println("Generated Matrix is : \n");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                a[i][j]=r.nextInt(11);
                System.out.print(a[i][j]+"    ");
            }
            System.out.println();
        }
        dos.writeInt(n);

        for (int i =0;i<n;i++){
            for (int j=0;j<n;j++){
                dos.writeInt(a[i][j]);
            }

        }
        System.out.println("Result : "+dis.readUTF());
        s.close();
    }
}