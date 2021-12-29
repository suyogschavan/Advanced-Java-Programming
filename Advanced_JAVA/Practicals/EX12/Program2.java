import javax.swing.*;
import java.awt.event.*;

public class Program2 extends JFrame implements ActionListener {
    
    JPasswordField p;
    JLabel label;
    JButton button;
    Program2() {

        p = new JPasswordField();
        label = new JLabel();
        button = new JButton("Check Password");

        p.setBounds(30, 30, 150, 30);
        button.setBounds(30, 90, 150, 30);
        label.setBounds(30, 150, 300, 30);

        button.addActionListener(this);

        add(p);

        add(button);
        add(label);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 400);

    }
    
    public void actionPerformed(ActionEvent e) {
        
        String pass = new String(p.getPassword());

        if (pass.length() <= 6) {
            label.setText("Password length must be greater than 6 characters");
        }
        else{ 
            label.setText("Password Accepted");
        }
    }
    
    public static void main(String[] args) {
        new Program2();
    }
}
