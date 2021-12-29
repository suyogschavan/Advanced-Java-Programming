import java.sql.*;

public class Statementex {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/first";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, "root", "Suyog#2003");
            System.out.println("Connection established \n");
            Statement ex = connection.createStatement();
            ResultSet rs = ex.executeQuery("select * from students");

            while (rs.next()) {
                System.out.println(" | "+rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getString(3));
            }

            System.out.println("\n");
            connection.close();
            System.out.println("Connection closed");


            

        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
