package EX10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KEYBOURD extends JFrame implements KeyListener {
	public String msg = " ";
	int X = 10, Y = 20;
	JTextField jta;

	KEYBOURD(){
		jta = new JTextField();
		jta.setBounds(20, 40, 100, 300);
		// add(msg);
		add(jta);
		addKeyListener(this);
		requestFocus();
		
		setLayout(null);
		setSize(400, 400);
		setVisible(true);


	}

	public static void main(String[] args) {
		new KEYBOURD();
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		msg+=e.getKeyChar();
		repaint();
	}

	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		jta.setText("Key Down");
	}

	private void showStatus(String string) {
	}

	
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		jta.setText("Key Up");
	}
	

}
