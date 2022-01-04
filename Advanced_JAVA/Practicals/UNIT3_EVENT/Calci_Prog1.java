package Advanced_JAVA.Practicals.UNIT3_EVENT;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calci_Prog1 extends JFrame{
	
	JLabel l1 = new JLabel("  Enter first number");
	
	JLabel l2 = new JLabel("  Enter second number");
	JLabel l3 = new JLabel("  Addition ");
	JTextField ta1 = new JTextField();
	JTextField ta2 = new JTextField();
	JTextField ta3 = new JTextField();
	JButton button = new JButton(" ADD ");	
		
	Calci_Prog1(){

		add(l1);
		add(ta1);
		add(l2);
		add(ta2);
		add(l3);
		add(ta3);
		add(button);
	
	
		button.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(ta1.getText());
				int num2 = Integer.parseInt(ta2.getText());

				int c = num1 + num2;

				ta3.setText(" "+c);
				
			}
			
		});

		setLayout(new GridLayout(4, 2, 5, 5));
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Addition Cali");
		setVisible(true); 
	}

	public static void main(String[] args) {
		new Calci_Prog1();
	}


}
