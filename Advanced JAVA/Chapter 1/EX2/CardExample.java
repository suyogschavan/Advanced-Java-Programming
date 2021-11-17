
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardExample extends JFrame implements ActionListener{
    
    CardLayout crd;

    JButton btn1, btn2, btn3;
    Container cPane;

    CardExample(){

        cPane = getContentPane();
        crd = new CardLayout(50, 100);

        cPane.setLayout(crd);

        btn1 = new JButton("India");
        btn2 = new JButton("Maharashtra");
        btn3 = new JButton("Pune");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        cPane.add("a", btn1);
        cPane.add("b", btn2);
        cPane.add("c", btn3);

    }
public void actionPerformed(ActionEvent e) {
    
    crd.next(cPane);
}

public static void main(String[] args) {
    
    CardExample crdl = new CardExample();

    crdl.setSize(300, 300);
    crdl.setVisible(true);
    crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

}
