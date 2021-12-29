
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Score extends JFrame implements ActionListener {

    Score(String username, String enrollment, int score) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/microproject";
        Connection conn = DriverManager.getConnection(url, "root", "Suyog#2003");

        PreparedStatement p = conn.prepareStatement("insert into microproject.studentsData values(?,?,?,?)");

        p.setString(1, null);
        p.setString(2, username);
        p.setString(3, enrollment);
        p.setInt(4, score);

        int update = p.executeUpdate();
        System.out.println("data inserted " + update);

        setBounds(600, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon("H:/DOCUMENTS/Nothing/JAVA_Project_3/score.png");
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 200, 300, 250);
        add(l1);
        JLabel l4 = new JLabel();
        add(l4);
        l4.setFont(new Font("RALEWAY", Font.BOLD, 26));

        l4.setBounds(500, 60, 300, 250);
        JLabel l2 = new JLabel(" " + username + " your Quize Exam ended Successfully!");
        l2.setBounds(45, 110, 700, 30);
        l2.setFont(new Font("RALEWAY", Font.PLAIN, 26));
        add(l2);

        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(500, 300, 300, 30);
        l3.setFont(new Font("Jokerman", Font.PLAIN, 26));
        l3.setForeground(new Color(199, 21, 133));
        add(l3);

        JButton b1 = new JButton("DONE");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);

        b1.setBounds(500, 400, 120, 30);
        add(b1);

    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        System.exit(0);
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new Score("", "", 0).setVisible(true);

    }
}
