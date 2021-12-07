import javax.swing.*;
import java.awt.event.*;

public class WindowDemo  {

    JFrame f;
    public WindowDemo(){

        f = new JFrame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
            

        f.setSize(800, 600);
        f.setLayout(null);
        f.setVisible(true);

    }


    public static void main(String[] args) {
        new WindowDemo();
    }


    
}
