import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Asach2 extends JFrame implements ActionListener {

    JLabel label, label2;
    JButton button;
    Asach2() {

        label = new JLabel("Click on download button");
        add(label);

        button = new JButton("Download");
        add(button);
        button.addActionListener(this);

        label2 = new JLabel();
        add(label2);
        
        setTitle("Testing own skills in java codding");
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        label2.setText("Download will start atomatically");
        
    }
    public static void main(String[] args) {
        new Asach2();
    }
    
}
