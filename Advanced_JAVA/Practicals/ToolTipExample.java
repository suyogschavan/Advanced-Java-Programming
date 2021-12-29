// package EX8;
import javax.swing.*;
class ToolTipExample extends JFrame{

	ToolTipExample(){

		JPasswordField value = new JPasswordField();
		value.setBounds(100, 50, 100, 25);
		
		value.setToolTipText("Enter password");

		JLabel label = new JLabel("Pass");
		label.setBounds(50, 50, 100, 25);

		add(label);
		add(value);

		setSize(300, 300);
		setLayout(null);
		setVisible(true);
		setTitle("ToolTip");
		
	}

	public static void main(String[] args) {
		new ToolTipExample();
	}
}
