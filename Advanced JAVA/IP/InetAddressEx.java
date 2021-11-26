import java.net.*;

public class InetAddressEx {
    
    public static void main(String[] args) {
        try{
        InetAddress address = InetAddress.getLocalHost();

        System.out.println("LocalHost --> "+address);

       InetAddress Address = InetAddress.getByName("google.com");
        System.out.println("Google --> "+Address);

        InetAddress SWT[] = InetAddress.getAllByName("www.nba.com");
        
        for( int i = 0; i < SWT.length; i++ ){
            System.out.println("All --> "+SWT[i]);
        }
    }
    catch( Exception e ){
    System.out.println(e);
    }
    }
}
