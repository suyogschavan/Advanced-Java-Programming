package Advanced_JAVA.Practicals.EX16.EXQ1;
import java.util.*;
import java.io.*;
import java.net.*;

public class Client2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            Socket socket = new Socket("localhost", 4444);

            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());

            int number;
            String result = "";

            System.out.println("Enter number : ");
            number = scanner.nextInt();
            outputStream.write(number);
            
            result = inputStream.readUTF();
            System.out.println("Server says : "+result);

            inputStream.close();
            socket.close();


        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
