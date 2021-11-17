

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseDemo1 extends JFrame implements MouseListener {
    
    JLabel l;

    MouseDemo1(){
        l = new JLabel("Hello Mouse");
        addMouseListener(this);
        l.setBounds(50, 150, 500, 100);
        add(l);
        
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("mouse clicked(# of clicks:"+e.getClickCount());
    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Pressed no, of clicks:" +e.getClickCount() + " at position:" + e.getX()+" " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Released; no of clicks:"+e.getClickCount());
    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Entered at position: x= " + e.getX()+" y= " + e.getY());
    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseDemo1();
    }
    
}
