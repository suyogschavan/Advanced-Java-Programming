package Advanced_JAVA.Practicals.EX16.EXQ1;


import java.io.*;
import java.net.*;

public class Server {



    public static void main(String[] args) {
        try {

            ServerSocket srSocket = new ServerSocket(4444);
            Socket socket = srSocket.accept();

            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

            
            int number, count = 0;
            number = input.read();

            System.out.println("Client asking for number: " + number);

            for(int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }

            String result;
            if (count == 0) {
                result = "\n Yes it is a Prime number.\n";
            } else {
               result = "\n No it is not a prime number \n";
            }

           System.out.println(result);
            output.writeUTF(result);

        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
