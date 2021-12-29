import java.awt.*;
import javax.swing.*;
public class Q1ComboEx extends JFrame {

	Q1ComboEx(){

		String[] cities = {"Solapur", "Mumbai", "Banglore","Mumbai"};

		JComboBox cmb = new JComboBox(cities);
		add(cmb);

		JLabel jl = new JLabel("You Selected Mumbai");
		add(jl); 

		setLayout(new FlowLayout());
		setVisible(true);
		setTitle("Q1ComboEx");
		setSize(400, 350);
	
	}

	public static void main(String[] args) {
		new Q1ComboEx();
	}
	
}