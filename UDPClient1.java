import java.net.*;
import java.util.*;

public class UDPClient1{
    public static void main(String[] args)throws Exception{
        DatagramSocket socket = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.println("Connected to Server...\n");
        System.out.println("Enter the message you want to send \n ");
        String message = sc.nextLine();
        byte[] buffer =message.getBytes();
        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket packet=
        new DatagramPacket(
            buffer,
            buffer.length,
            address,
            5000
        );
        socket.send(packet);
        byte[] receiveBuffer=new byte[1024];
        DatagramPacket response =
        new DatagramPacket(
            receiveBuffer,
            receiveBuffer.length
        );
        socket.receive(response);
        String reply=
        new String(
            response.getData(),
            0,
            response.getLength()
        );
        System.out.println("Result:" +reply);
        socket.close();
        }
}