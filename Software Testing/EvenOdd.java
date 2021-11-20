import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i <=10; i++) {
        System.out.println("Enter the number : ");
        try {
            int num = sc.nextInt();

            if (num%2 == 0) {
                System.out.println(num + " is Even number");   
            }
            else{
                System.out.println(num + " is Odd number");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Invalid input ");
        }
    }

      
       
    }
}
