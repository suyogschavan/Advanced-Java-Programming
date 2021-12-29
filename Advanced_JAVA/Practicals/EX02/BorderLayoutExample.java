import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample extends JFrame{

    public static void main(String[] args) {

        //Frame
        JFrame f = new JFrame();

        //Buttons
        Button b1 = new Button("NORTH");
        b1.setBounds(20, 30, 30, 30);
        Button b2 = new Button("SOUTH");
        Button b3 = new Button("East");
        Button b4 = new Button("West");
        Button b5 = new Button("Center");

        //Panel
        // Panel panel = new Panel();
        // panel.setBackground(Color. RED);
        
        //ScrollBar
        // JScrollBar s1 = new JScrollBar(Scrollbar.VERTICAL);

        //Adding Elements to Frame
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        // f.add(panel, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        // f.add(s1, BorderLayout.EAST);
        
        new BorderLayout(3,2);
        // f.setLayout(new BorderLayout(3,2));
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);// for terminating a program 
        f.setTitle("Experiment 2 by Suyog Chavan");
        f.setSize(500, 450);
        f.setVisible(true);

    }
    
}
