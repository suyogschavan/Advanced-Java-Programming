package Q1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client1 {

    public static void main(String[] args) throws UnknownHostException, IOException {

        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 3333);
        DataInputStream is = new DataInputStream(s.getInputStream());
        DataOutputStream os = new DataOutputStream(s.getOutputStream());

        String uname = "", pass = "";

        System.out.println("Enter username: ");
        uname = sc.nextLine();
        os.writeUTF(uname);

        System.out.println("Enter password: ");
        pass = sc.nextLine();
        os.writeUTF(pass);

        String auth="";
        
        auth = is.readUTF();

        System.out.println(auth);
        

        // if (uname.equals("Suyog") && pass.equals("Pass")) {
        //     System.out.println("\nUsername and password Mached!!! \n");
        //     System.out.println("Welcome "+uname);
        // } else {
        //     System.out.println("\n Username and password Mismached!!! \n");
        // }

        
        is.close();
        s.close();

    }
}
