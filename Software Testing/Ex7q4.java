
import java.util.*;

public class Ex7q4 {
    

    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Length: ");
        int length = scanner.nextInt();

        System.out.println("Enter Count: ");
        int count = scanner.nextInt();
        
        while (count<=6) {

            if (length>=100) { 

                length = length - 2;
                
            } else {

                length = count*length;
                
            }

            count++;
            
        }
        System.out.println(length);

    }
}
