package Samples;

import java.awt.*;

public class AWTExample2 extends Frame {

    AWTExample2(){

        Frame f = new Frame();

        Label i = new Label("Employee ID : ");

        Button b = new Button("Submit");

        TextField t = new TextField();

        // new TextArea();

        i.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        b.setBounds(100, 100, 80, 30);


        f.add(b);
        f.add(i);
        f.add(t);


        f.setSize(400,300);
        f.setTitle("Employee info");
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new AWTExample2();
    }

}
