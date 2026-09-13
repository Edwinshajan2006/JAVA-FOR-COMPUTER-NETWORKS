import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPClient3 {
    public static void main(String[] args) throws Exception{
    DatagramSocket socket=new DatagramSocket();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sentence..");
    String sentence=sc.nextLine();
    System.out.println("Enter the character");
    char ch=sc.nextLine().charAt(0);
    String message= sentence+"|"+ch;
    byte[] buffer=message.getBytes();
    InetAddress address=InetAddress.getByName("Localhost");
    DatagramPacket packet=new DatagramPacket(buffer,buffer.length,address,5000);
    socket.send(packet);
    byte[] receiveBuffer=new byte[1024];
    DatagramPacket response = new DatagramPacket(receiveBuffer,receiveBuffer.length);
    socket.receive(response);
    String result=new String(response.getData(),0,response.getLength());
    System.out.println("Occurrence"+result);
    socket.close();
    sc.close();

    
    }
}
