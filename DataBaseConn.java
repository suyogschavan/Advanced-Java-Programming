

import java.awt.*;
import java.sql.*;

import javax.swing.*;

public class DataBaseConn extends JFrame {
    
   DataBaseConn(String username, int score){
       JLabel label = new JLabel(" Username: " + username+" Score: " + score);

       add(label);

       setLayout(new FlowLayout());
       setSize(300, 400);
       
   }

    public static void main(String[] args) {
        
        new DataBaseConn("", 0).setVisible(true);
    }
}
