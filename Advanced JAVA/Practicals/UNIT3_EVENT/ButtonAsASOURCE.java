import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ButtonAsASOURCE extends JFrame implements ActionListener {
	
	JTextField tf;
	ButtonAsASOURCE(){

		tf = new JTextField();
		//BONDS

		JButton b = new JButton("Click me");

		b.addActionListener(this);

		add(b);
		b.setBounds(30, 50, 100, 35);
		add(tf);

		setSize(400, 500);
		setLayout(null);
		setVisible(true);

	
	}

	public void actionPerformed(ActionEvent e){
		tf.setText("Click me");
	}

	public static void main(String[] args) {
		new ButtonAsASOURCE();
	}
	
}
