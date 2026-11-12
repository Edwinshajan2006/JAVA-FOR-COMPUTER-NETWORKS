import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);

        System.out.println("Library Server Started");

        while (true) {
            Socket s = ss.accept();

            new Thread(() -> {
                try {
                    DataInputStream dis = new DataInputStream(s.getInputStream());
                    DataOutputStream dos = new DataOutputStream(s.getOutputStream());

                    String book = dis.readUTF();
                    String result = "";

                    if (book.equalsIgnoreCase("101") ||
                        book.equalsIgnoreCase("The Alchemist")) {
                        result = "Title: The Alchemist\nAuthor: Paulo Coelho\nAvailability: Available";
                    }
                    else if (book.equalsIgnoreCase("102") ||
                             book.equalsIgnoreCase("Wings of Fire")) {
                        result = "Title: Wings of Fire\nAuthor: APJ Abdul Kalam\nAvailability: Issued";
                    }
                    else if (book.equalsIgnoreCase("103") ||
                             book.equalsIgnoreCase("Clean Code")) {
                        result = "Title: Clean Code\nAuthor: Robert Martin\nAvailability: Available";
                    }
                    else {
                        result = "Book Not Found";
                    }

                    result = "Server PID: " +
                             ProcessHandle.current().pid() + "\n" + result;

                    dos.writeUTF(result);

                    s.close();
                }
                catch (Exception e) {
                    System.out.println(e);
                }
            }).start();
        }
    }
}