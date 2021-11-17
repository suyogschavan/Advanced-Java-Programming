import java.awt.*;
import javax.swing.*;


public class BoxLayoutExample extends Frame {
    
    public BoxLayoutExample(){

        // Frame f1 = new Frame();

        Button b1 = new Button("One");
        Button b2 = new Button("Two");
        Button b3 = new Button("Three");
        Button b4 = new Button("Four");
        Button b5 = new Button("Five");
        Button b6 = new Button("Six");
        setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        

        // f1.add(b1);
        // f1.add(b2);
        // f1.add(b3);
        // f1.add(b4);
        // f1.add(b5); 
        // f1.add(b6);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        setTitle("BoxLayout example by SUYOG");
        setVisible(true);
        setSize(400, 400);

        // setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        // setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        // setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
    }
    
    public static void main(String[] args) {
        new BoxLayoutExample();
    }
}
