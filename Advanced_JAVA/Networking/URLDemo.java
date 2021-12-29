

import java.net.*;
public class URLDemo {
    public static void main(String[] args) {
       try {
        URL demo = new URL("http://mitwpu.edu.in/school-of-polytechnic/");

        System.out.println("Protocol: " + demo.getProtocol());
        System.out.println("Host Name: " + demo.getHost());
        System.out.println("File Name: " + demo.getFile());
        System.out.println("Port Number"+demo.getPort());
    } catch (Exception e) {
        //TODO: handle exception
    } 
    }
    
}
