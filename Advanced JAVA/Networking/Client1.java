import java.io.*;
import java.net.*;

public class Client1 {
    
    public static void main(String[] args) {
        try {
            
            Socket clientSocket = new Socket("localhost", 6666);
            DataOutputStream out = new DataOutputStream(clientSocket.getOutputStream());
            out.writeUTF("Hello server!");
            out.flush();
            out.close();
            clientSocket.close();

        } catch (Exception e) {
            
            System.out.println(e);

            //TODO: handle exception
        }
    }
}
