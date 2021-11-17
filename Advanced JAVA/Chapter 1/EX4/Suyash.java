import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Suyash extends JFrame {

    JButton first, last, middle;
    Suyash(){
        
        first = new JButton("SUYASH");
        last = new JButton("CHAVAN");
        middle = new JButton("SANTOSH");
        last.setVisible(false);
        middle.setVisible(false);

        add(first);
        add(middle);
        add(last);


        first.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // last.setText("CHAVAN");  
                last.setVisible(true);      
            }
        });


        last.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                // last.setText("CHAVAN");  
                middle.setVisible(true);      
            }
        });
        setLayout(new FlowLayout());
        setTitle("SUYASH");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     // TODO Auto-generated method stub
    //     // last.setText("CHAVAN");  
    //     last.setVisible(true);      
    // }

    public static void main(String[] args) {
        new Suyash();
    }


    
}
