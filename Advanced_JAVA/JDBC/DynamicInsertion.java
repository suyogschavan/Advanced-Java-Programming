import java.sql.*;
import java.util.*;

public class DynamicInsertion {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Scanner scanner = new Scanner(System.in);
            String url= "jdbc:mysql://localhost:3306/first";
            
            Connection conn = DriverManager.getConnection(url, "root", "Suyog#2003");
            
            int id;
            String name = "" , last = "" ;
            
            System.out.println("Enter ID: ");
             id = scanner.nextInt();

            System.out.println("Enter First Name: ");
            name = scanner.next();

            System.out.println("Enter Last Name: ");
            last = scanner.next();

            PreparedStatement p = conn.prepareStatement("insert into first.students values(?,?,?)");
            
            p.setInt(1,  id);
            p.setString(2, name);
            p.setString(3, last);

            int i1 = p.executeUpdate();
            System.out.println("data inserted "+i1);
            System.out.println("\n");

            conn.close();
        
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
