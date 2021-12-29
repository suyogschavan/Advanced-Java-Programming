
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1, t2;

    Project() {
        setBounds(400, 200, 1200, 500); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon("H:/DOCUMENTS/Nothing/JAVA_Project_3/login.jpeg");
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 600, 500);
        add(l1);

        JLabel l2 = new JLabel("JAVA Quiz");
        l2.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(750, 60, 300, 45);
        add(l2);

        JLabel l3 = new JLabel("Enter Your Name");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(810, 175, 300, 20);
        add(l3);

        b1 = new JButton("NEXT");
        b1.setBounds(735, 340, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        // b1.setVisible(false);
        add(b1);
        b1.addActionListener(this);


        t1 = new JTextField();
        t1.setToolTipText("(First Name) (Last Name)");
        t1.setBounds(735, 200, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        
        add(t1);
        if (t1.getText() == null) {
            b1.setVisible(false);
        } else {
            b1.setVisible(true);
        }

        JLabel l4 = new JLabel("Enter Your Enrollment No.");
        l4.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(790, 245, 300, 20);
        add(l4);

        t2 = new JTextField(20);
        t2.setBounds(735, 270, 300, 25);
        t2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t2);

        b2 = new JButton("Exit");
        b2.setBounds(915, 340, 120, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            String name = t1.getText();
            String number = t2.getText();

            this.setVisible(false);
            new Rules(name, number);
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Project();
    }

}
