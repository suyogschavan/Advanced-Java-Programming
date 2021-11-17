
import java.awt.*;

public class Self extends Frame {

    public static void main(String[] args) {
        Frame f = new Frame("Suyog Chavan");

        Button b1 = new Button("Submit");
        Button b2 = new Button("OK");

        b1.setBounds(50, 50, 70, 30);
        b2.setBounds(50, 101, 70, 30);

        f.add(b1);
        f.add(b2);

        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(null);

    }
    
}