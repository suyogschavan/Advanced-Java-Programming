package Q2;

import java.net.*;
import java.io.*;

public class Server1 {

    public static void main(String[] args) {
        try {
            ServerSocket sv1 = new ServerSocket(3333);
            System.out.println("\n Server started at port 3333 \n");
            Socket s = sv1.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream os = new DataOutputStream(s.getOutputStream());

            String uname = "", pass = "";
            String auth = "";

            uname = din.readUTF();
            pass = din.readUTF();

            System.out.println("Client Entered username: " + uname);
            System.out.println("Client Entered password: " + pass);

            if (uname.equals("Suyog") && pass.equals("Pass")) {
                auth = "\n Username and password Mached!!! \n";
            } else {
                auth = "\n Username and password Mismached!!! \n";
            }

            System.out.println(auth);

            os.writeUTF(auth);
            din.close();
            s.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}