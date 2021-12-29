
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * CheckDrivers
 */
public class CheckDrivers {

    public static void main(String[] args) {
        
        try {
            
            String url;
            Connection con = null;

            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("Drivers are loaded ");

                url = "jdbc:mysql://localhost:3306/first";
                con = DriverManager.getConnection(url, "root", "Suyog#2003");

                System.out.println("Connection established");
                con.close();
                System.out.println("Connection closed");
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println(e.toString());
            }

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e.toString());
        }
    }
    
}