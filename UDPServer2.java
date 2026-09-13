import java.net.*;

public class UDPServer2 {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(5000);
        byte[] buffer=new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
        socket.receive(packet);
        String message= new String(packet.getData(),0,packet.getLength());
        int count = 0;
        for (int i = 0;i<message.length();i++){
            char ch=message.charAt(i);

            if(ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
            count++;
            }
        }
        String result=String.valueOf(count);
        byte[] sendBuffer=result.getBytes();
        DatagramPacket response=
        new DatagramPacket(sendBuffer,sendBuffer.length,packet.getAddress(),packet.getPort());
        socket.send(response);
        socket.close();

    }
}
