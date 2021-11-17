package EX10;

import javax.swing.*;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.event.MouseAdapter;

public class MouseAdapterEx extends MouseAdapter {
    
   JFrame j;

    MouseAdapterEx() {

        j = new JFrame();
        j.addMouseListener(this);
        j.setLayout(null);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.setSize(800, 600);
        j.setTitle("Mouse Adapter");
    }

    public void mouseClicked(MouseEvent e) {
        Graphics g = j.getGraphics();
        g.setColor(Color.blue);g.fillOval(e.getX(), e.getY(), 30, 30);
    }


public static void main(String[] args) {
    new MouseAdapterEx();
}
}