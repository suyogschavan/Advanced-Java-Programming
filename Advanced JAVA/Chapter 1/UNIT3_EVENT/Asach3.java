import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Asach3 extends JFrame {
    
    JLabel label1, label2, label3;
    JTextArea textField1, textField2, textField3;
    JButton button1;

    Asach3() {
        label1 = new JLabel("Type Something in textBox");
        add(label1);
        
         textField1 = new JTextArea();
        add(textField1);
        
        label3 = new JLabel("");   
        add(label3);

        button1 = new JButton("Check what you typed");
        add(button1);
        label2 = new JLabel("You typed ------------->");
        add(label2);
        textField2 = new JTextArea();
        add(textField2);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent i) {
                String text = textField1.getText();
                textField2.setText(text);
            }
        });

        setTitle("Asach 3");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2,10,10));
    }
    public static void main(String[] args) {
        new Asach3();
    }
}
