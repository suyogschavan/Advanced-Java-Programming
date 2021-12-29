package NetW;

import java.net.*;
import java.io.*;
public class Server1 {

    public static void main(String[] args) {
        try {
            ServerSocket sv1 = new ServerSocket(3333);
            Socket s = sv1.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream os = new DataOutputStream(s.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str="", str2="";

            while (!str.equals("stop")) {
                str = din.readUTF();
                System.out.println("Client says: " + str);
                str2=br.readLine();
                os.writeUTF(str2);
                os.flush();
            }

            din.close();
            s.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        

    }
}
