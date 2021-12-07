package DATAGRAMex;

import java.net.*;


public class DServer {
    public static void main(String[] args) {
        try {
            

            DatagramSocket socket = new DatagramSocket(3000);
            byte[] buf = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buf, 1024);

            socket.receive(packet);

            String strRecv = new String(packet.getData(), 0, packet.getLength());

            System.out.println(strRecv);
            socket.close();

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
