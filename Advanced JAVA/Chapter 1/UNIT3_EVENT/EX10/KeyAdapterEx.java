package EX10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KeyAdapterEx extends KeyAdapter {

    JFrame f;
    JLabel l;
    JTextArea a;

    KeyAdapterEx(){

        f = new JFrame();
        a = new JTextArea();
        l = new JLabel();

        a.addKeyListener(this);
        f.add(l);
        f.add(a);

        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
    }

    public void keyReleased(KeyEvent e) {

        String key = a.getText().toString();
        String words[] = key.split("\\s");
        l.setText("Words: " + words.length + " Characters: "+key.length());
    }

    public static void main(String[] args) {
        new KeyAdapterEx();
    }


}
