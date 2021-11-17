
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample extends JFrame {

    public static void main(String[] args) {
        
        JFrame frame= new JFrame();
       
       

        //Adding Buttons to Frame
        
        frame. add(new Button(" 7"));
       frame. add(new Button(" 8"));
       frame. add(new Button(" 9"));
        frame.add(new Button(" 4"));
        frame.add(new Button(" 5"));
        frame.add(new Button(" 6"));
        frame.add(new Button(" 1"));
        frame.add(new Button(" 2"));
          frame. add(new Button(" 3"));
        // frame. add(new Button(" 0"));

 //Setting GridLayout
        frame.setLayout(new GridLayout(3, 3, 10, 10));

        frame. setTitle("Grid Layout");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);// Program Terminates when user click on close 
        
    }

    

}