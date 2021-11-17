import java.awt.BorderLayout;

import javax.swing.*;

public class example1 extends JFrame {
	
	example1(){

		// JButton b1 = new JButton("One");
		JButton b2 = new JButton("Two");
		JButton b3 = new JButton("Three");
		JLabel l1 = new JLabel("HIIII");

		// add(b1, BorderLayout.CENTER);
		add(b2, BorderLayout.NORTH);
		add(b3, BorderLayout.CENTER);
		add(l1, BorderLayout.EAST);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(400, 400);
		setVisible(true);
		setTitle("Example1");
	}

	public static void main(String[] args) {
		new example1();
	}
}
