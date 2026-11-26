import java.io.*;
import java.util.*;
import java.io.*;
import java.net.*;


public class Server{
    public static void main(String[] args)throws Exception{
        ServerSocket ss=new ServerSocket(5000);
        System.out.println("File server has started : ");
        while(true){
            Socket s=ss.accept();
            new Thread(()-> {
                try{
                    DataInputStream dis=new DataInputStream(s.getInputStream());
                    DataOutputStream dos=new DataOutputStream(s.getOutputStream());
                    String name=dis.readUTF();
                    File f=new File("server_file",name);
                    String result="Server PID : "+ProcessHandle.current().pid()+"\n";
                    if(f.exists() && f.isFile()){
                        result+="File Found \n";
                        Scanner fs=new Scanner(f);
                        while(fs.hasNextLine()){
                            result+=fs.nextLine()+"\n";
                        }
                        fs.close();

                    } 
                    else{
                        result+="File not Found";

                    }
                    dos.writeUTF(result);
                    s.close();
                }
                catch(Exception e){
                    System.out.println(e);
                }
            }).start();
        }
}
}