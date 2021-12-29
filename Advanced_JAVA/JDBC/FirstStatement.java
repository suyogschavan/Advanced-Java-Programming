import java.sql.*;

public class FirstStatement {
    public static void main(String[] args) {

        try {

            String url = "jdbc:mysql://localhost:3306/first";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, "root", "Suyog#2003");
            System.out.println("Connection established \n");

            // creating statement
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select * from students");

            System.out.println("\n ID \t First Name \t Last Name \n");
            while (rs.next()) {
                System.out.println(+rs.getInt(1) + " \t  " + rs.getString(2) + " \t  " + rs.getString(3));
            }

            System.out.println("\n");
            conn.close();
            stmt.close();
            rs.close();

            System.out.println("Connection closed \n");
        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
