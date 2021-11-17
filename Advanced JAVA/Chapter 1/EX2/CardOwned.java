import javax.swing.*;
import java.awt.*;
public class CardOwned extends JFrame {

    JButton btn1, btn2, btn3;
    CardLayout layout;
    
    CardOwned(){
        layout = new CardLayout();
        btn1 = new JButton("Suyog");
        btn2 = new JButton("Pune");
        btn3 = new JButton("Maharashtra");

        add(btn1);
        add(btn2);
        add(btn3);
    }
    
}
