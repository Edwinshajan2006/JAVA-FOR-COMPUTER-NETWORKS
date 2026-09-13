import java.net.*;

public class UDPServer1{
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(5000);
            System.out.println("Connected to Client... + nextLine() ");
            byte[] buffer = new byte[1024];
            DatagramPacket packet= 
            new DatagramPacket(buffer,buffer.length);
            socket.receive(packet);
            String message =
            new String(
                packet.getData(),
                0,
                packet.getLength()

            );
            String result = message;
            byte[] sendBuffer = result.getBytes();
            System.out.println(result);

            DatagramPacket response =
            new DatagramPacket(sendBuffer,sendBuffer.length,packet.getAddress(),packet.getPort()
            
        );
        socket.send(response);
        socket.close();
    }
}