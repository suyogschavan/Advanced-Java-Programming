package EX10;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MouseAsSource extends JFrame implements MouseListener {
	
	JLabel label1;
	MouseAsSource(){
		
		label1 = new JLabel(" Mouse is not here!");
		add(label1);
		this.addMouseListener(this);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setTitle("Mouse");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}

	public static void main(String[] args) {
		new MouseAsSource();
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label1.setText(" Mouse clicked");
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label1.setText(" Mouse Pressed");
		
	}
	
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label1.setText(" Mouse Released");
		
	}
	
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label1.setText(" Mouse Entered");
		
	}
	
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label1.setText(" Mouse Gone ");
		
	}
}
