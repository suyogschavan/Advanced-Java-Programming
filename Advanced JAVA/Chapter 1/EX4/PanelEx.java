

import javax.swing.*;
import javax.swing.JPanel;

public class PanelEx extends JFrame {

	PanelEx(){

		JFrame f = new JFrame("Panel");
		JLabel l = new JLabel("Label");
		JLabel l1 = new JLabel("Label 1");
		JButton b1 = new JButton("Button 1");
		JPanel p = new JPanel();


		p.add(l);
		p.add(l1);
		p.add(b1);
		f.add(p);

		f.setVisible(true);
		f.setSize(500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		
		new PanelEx();
	}
	
}
