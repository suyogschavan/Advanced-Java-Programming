package Advanced_JAVA.Practicals.EX15;


import java.net.*;
import java.util.Date;

public class ExerciseQue2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection();

            long d = connection.getDate();
            if (d == 0) {
                System.out.println("Date not found");
            } else {
                System.out.println("Date: " + new Date(d));
            }

            System.out.println("Containt Type: " + connection.getContentType());

            int count = connection.getContentLength();
            if (count == -1) {
                System.out.println("Content length not found");
            } else
                System.out.println("Containt Length : " + connection.getContentLength());

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
