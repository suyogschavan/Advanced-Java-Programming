package Samples;

import java.awt.*;

public class Label3 extends Frame {
    public static void main(String[] args) {

        Frame f = new Frame("Lable Example");
        Label l1, l2;
        TextField t = new TextField();
       

        l1 = new Label("First Lable");
        l2  = new Label("Second Lable");
        Button b = new Button("Click Me!!");  

        l1.setBounds(20, 80, 80, 30);
        l2.setBounds(40, 100, 80, 40);
        b.setBounds(100, 200, 80, 30);
        t.setBounds(20, 100, 80, 30);

      f.add(b);
      f.add(l1);
      f.add(l2);
      f.add(t);
     

      f.setSize(400, 400);
      f.setVisible(true);
      f.setLayout(null);

    }
}
