
import javax.swing.*;
import java.awt.event.*;

public class Program234 extends JFrame {

    JLabel label;
    Program234() {

        setTitle("Suyog Chavan");
        setLayout(null);
        setVisible(true);
        setSize(300, 300);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        label = new JLabel();
        label.setBounds(30, 30, 300, 400);
        add(label);

        this.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                
                label.setText("Mouse Dragged on possition X: " + e.getX() + " " + e.getY());

            }
        });
    }
    public static void main(String[] args) {
            new Program234();
        }
   
}
