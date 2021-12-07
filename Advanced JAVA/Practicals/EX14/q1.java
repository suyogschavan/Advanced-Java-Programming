import java.net.*;
import java.util.*;

public class q1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Host Name");
        String str = scanner.next();


        try {

            InetAddress ip = InetAddress.getByName(str);
            System.out.println("IP Address of "+str+ " is : " + ip.getHostAddress());
        
        } catch (Exception e) {
            
            System.out.println(e);
        }

    }
}
