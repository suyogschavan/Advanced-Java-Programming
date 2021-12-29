import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Program1 extends JFrame implements ActionListener {
JLabel l1, l2, l3;
JTextField t;
JPasswordField pass;
JButton button;
String Password = "suyog";

    Program1(){
        l1 = new JLabel("User Name");
        l2 = new JLabel("Password");
        l3 = new JLabel();
        // l3.setVisible(false);
        pass = new JPasswordField();
        t = new JTextField();

        button = new JButton("Submit");
        button.addActionListener(this);

        add(l1);
        add(t);
        add(l2);
        add(pass);
        add(button);
        add(l3);

        setVisible(true);
        setLayout(new GridLayout(3,2,30,30));
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new Program1();
    }
    public void actionPerformed(ActionEvent e) {
        String p = new String(pass.getPassword());

        if (p.matches(Password) ) {
            l3.setText("Password Matched");
        } else {
            l3.setText("Password Mismatched");
        }
    }
}
