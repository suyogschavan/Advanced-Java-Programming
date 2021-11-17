package JTABBED;
// import java.awt.*;
import javax.swing.*;

public class CitiesPanel extends JPanel {
	public CitiesPanel(){
		JButton b1 = new JButton("Pune");
		JButton b2 = new JButton("Mumbai");
		JButton b3 = new JButton("Delhi");
		JButton b4 = new JButton("Kolkata");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
}