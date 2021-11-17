import java.awt.*;
// import javax.swing.*;

public class FlowLayoutExample extends Frame {
    public static void main(String[] args) {
      Frame jf = new Frame();

      Button b1 = new Button("One");
      Button b2 = new Button("Two");
      Button b3 = new Button("Three");

      jf.add(b1);
      jf.add(b2);
      jf.add(b3);
      jf.add(new Button("Four"));


    jf.setLayout(new FlowLayout());
    // jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jf.setVisible(true);
    jf.setSize(300, 300);
    jf.setTitle("FlowLayout Example by SUYOG");
    
    }
    
}
