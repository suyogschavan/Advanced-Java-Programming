package JTABBED;

// import javax.print.FlavorException;
import javax.swing.*;

public class FlavorsPanel extends JPanel {
	
	public FlavorsPanel(){

		JComboBox jcbox = new JComboBox();

		jcbox.addItem("Vanilla");
		jcbox.addItem("Strawberry");
		jcbox.addItem("Black Walnut");

		add(jcbox);

	}
}
