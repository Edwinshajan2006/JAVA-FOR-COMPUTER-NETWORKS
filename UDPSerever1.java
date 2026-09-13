import java.net.*;

public class UDPSerever1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(5000);
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        socket.receive(packet);

        String message = new String(packet.getData(), 0, packet.getLength());
        String result = message.toUpperCase();

        byte[] sendBuffer = result.getBytes();
        DatagramPacket response = new DatagramPacket(
            sendBuffer,
            sendBuffer.length,
            packet.getAddress(),
            packet.getPort()
        );

        socket.send(response);
        socket.close();
    }
}