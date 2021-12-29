
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Exercise2 extends JFrame implements MouseMotionListener {
    
    JLabel label;
   Exercise2(){
       label = new JLabel();
       add(label);
       setLayout(new FlowLayout());
       setSize(600, 600);
       setTitle(" Exercise Q. 3");
       setVisible(true);
       setDefaultCloseOperation(EXIT_ON_CLOSE);

       //adding mouse Listener
       addMouseMotionListener(this);
   }


public void mouseDragged(MouseEvent e) {
    // TODO Auto-generated method stub
    Graphics g = this.getGraphics();
    g.fillOval(e.getX(), e.getY(), 20, 20);
    label.setText("Mouse Dragged on possition X = " + e.getX()+" Y = "+ e.getY());
} 

public void mouseMoved(MouseEvent e) {
    // TODO Auto-generated method stub
    Graphics g = this.getGraphics();
    g.fillRect(e.getX(), e.getY(), 20, 20);
    label.setText("Mouse moving at possition X = "+e.getX()+" Y = "+e.getY());
} 
public static void main(String[] args) {
    new Exercise2();
}
   

}
