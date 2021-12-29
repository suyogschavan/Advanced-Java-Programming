import javax.swing.*;

public class Program3 extends JFrame{
    Program3(){
        setLayout(null);
        setVisible(true);
        setSize(300, 203);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPasswordField ps = new JPasswordField();
        ps.setEchoChar('*');

        ps.setBounds(30, 30, 300, 60);
        
        add(ps);
    }

    public static void main(String[] args) {
        new Program3();
    }
}
