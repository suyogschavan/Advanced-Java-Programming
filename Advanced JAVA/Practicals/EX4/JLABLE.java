// import java.awt.Container;
import java.awt.*;
import javax.swing.*;

// import jdk.internal.platform.Container;

public class JLABLE extends JFrame {


	public static void main(String[] args) {
		
		JFrame j = new JFrame();
		ImageIcon i = new ImageIcon("Advanced JAVA\\Componants\\How_to_use_icon.svg.png");
		JLabel j1 = new JLabel("JAVA");
		j1.setIcon(i);
		
		j.add(j1);
		

		j.setLayout(new FlowLayout());
		j.setVisible(true);
		j.setTitle("Exe");
		j.setSize(500, 500);
		j.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
