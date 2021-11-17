package Samples;

import java.awt.*;

public class Lable1 extends Frame {


    public Lable1(){

       Label ai = new Label("Welcome to JAVA");
       ai.setBounds(100, 80, 100, 80);
       add(ai);

       setSize(500, 400);
       setTitle("Practical 1");
       setLayout(null);
       setVisible(true);

    }

    public static void main(String[] args) {
        new Lable1();
    }
    
}
