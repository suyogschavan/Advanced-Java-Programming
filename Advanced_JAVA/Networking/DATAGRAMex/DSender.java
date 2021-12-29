package DATAGRAMex;

import java.net.*;


public class DSender {

    public static void main(String[] args) {
        
        try {
            
            DatagramSocket ds = new DatagramSocket();
            String str = "Hello world!";
            InetAddress address = InetAddress.getByName("127.0.0.1");

            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), address, 3000);

            ds.send(dp);
            
            ds.close();

        } catch (Exception e) {
            //TODO: handle exception\
            System.out.println(e);
            
        }
    }
}
