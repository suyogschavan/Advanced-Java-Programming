
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Asach1 extends JFrame implements ActionListener {
    JButton b1;
    JLabel b2;
    Asach1(){

        JButton b1 = new  JButton("Press to see");
        b2 = new JLabel();
        b1.addActionListener(this);
        add(b1);
        add(b2);
        setVisible(true);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setTitle("HIii");
      

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        b2.setText("Yes you did it!");
    }

    public static void main(String[] args) {
        Asach1 a = new Asach1();
        
    }

    }

