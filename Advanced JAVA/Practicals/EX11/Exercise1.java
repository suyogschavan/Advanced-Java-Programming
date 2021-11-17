
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class Exercise1 extends JFrame implements MouseListener {

    Exercise1(){

        addMouseListener(this);
        setSize(600,500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
      
        this.getContentPane().setBackground(Color.red);
    }

    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
        this.getContentPane().setBackground(Color.YELLOW);
    }

    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        this.getContentPane().setBackground(Color.BLUE);
        
    }

    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
    }

    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        this.getContentPane().setBackground(Color.WHITE);
    }
    public static void main(String[] args) {
        new Exercise1();
    }

    

    
}
