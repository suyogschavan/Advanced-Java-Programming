import java.sql.*;

public class InsertValues {
    
    public static void main(String[] args) {
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/first";
    
        Connection conn = DriverManager.getConnection(url, "root", "Suyog#2003");
        Statement stmt = conn.createStatement();

        int val = stmt.executeUpdate("INSERT INTO `first`.`students` (`id`, `firstName`, `lastName`) VALUES ('101', 'Suyog1', 'Chavan1');");

        System.out.println("1 row affected"+val);


        conn.close();


       } catch (Exception e) {
           System.out.println(e);
           //TODO: handle exception
       }


    }   
 }
