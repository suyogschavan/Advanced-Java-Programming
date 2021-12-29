import java.net.*;

public class ExerciseQue1 {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.msbte.org.in");

            System.out.println("Host name: " + url.getHost());
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Port : " + url.getPort());
            System.out.println("File : " + url.getFile());

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
