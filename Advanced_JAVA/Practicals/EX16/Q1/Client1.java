package Advanced_JAVA.Practicals.EX16.Q1;

import java.io.*;
import java.net.*;

public class Client1 {
    
    public static void main(String[] args) throws UnknownHostException, IOException {
        
        Socket s = new Socket("localhost", 3333);
        DataInputStream is = new DataInputStream(s.getInputStream());
        DataOutputStream os = new DataOutputStream(s.getOutputStream());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str="",str2="";
        while (!str.equals("stop")) {
            str=reader.readLine();
            os.writeUTF(str);
            os.flush();

            str2=is.readUTF();
            System.out.println("Server Says: " + str2);
        }



    }
}
