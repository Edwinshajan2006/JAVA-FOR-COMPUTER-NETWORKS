import java.util.*;
import java.io.*;
import java.net.*;


public class Server{
    public static void main (String[] args)throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        System.out.println("Server has Started : ");
        Socket s=ss.accept();
        DataInputStream dis=new DataInputStream(s.getInputStream());
        DataOutputStream dos=new DataOutputStream(s.getOutputStream());
        int n=dis.readInt();
        
        int a[][]=new int[n][n];
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=dis.readInt();

            }
        }
        boolean upper=true;
        boolean lower=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>j && a[i][j]!=0){
                    upper=false;
                }
                if(i<j&&a[i][j]!=0){
                    lower=false;
                }
            }
        }
            if(upper){
                dos.writeUTF("Upper triangle Matrix");
            }
            else if(lower){
                dos.writeUTF("Lower triangle Matrix ");

            }
            else{
                dos.writeUTF("Neither upper nor lower matrix");
            }
        s.close();
        ss.close();
        }
    }