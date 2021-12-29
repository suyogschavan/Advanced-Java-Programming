import java.io.*;
import java.net.*;

public class Socket1 {


    public static void main(String[] args) {
        try {

            ServerSocket server = new ServerSocket(6666);
            Socket socket = server.accept(); // established connection
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());

            String str = (String)inputStream.readUTF();
            System.out.println("message: " + str);

            socket.close();

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
