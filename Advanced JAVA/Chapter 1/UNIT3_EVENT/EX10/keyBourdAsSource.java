package EX10;
import javax.swing.*;
import java.awt.event.*; //keyEvent is a subclass of INPUTEVENT 

//OBJECT event is superclass of all event classes

public class keyBourdAsSource extends JFrame implements KeyListener {

	JLabel l;
	JTextArea ta;

	keyBourdAsSource(){
		ta = new JTextArea();
		ta.setBounds(50, 100, 300, 300);

		l = new JLabel("Press Something");
		l.setBounds(20, 20, 100, 100);

		ta.addKeyListener(this);

		add(l);
		add(ta);

		setLayout(null);
		setVisible(true);
		setSize(400, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new keyBourdAsSource();
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key Typed - "+ (e.getKeyChar()));
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key Pressed - "+ (e.getKeyLocation()));
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key Released - "+ (e.getKeyChar()));
		
		
	}
	
}
