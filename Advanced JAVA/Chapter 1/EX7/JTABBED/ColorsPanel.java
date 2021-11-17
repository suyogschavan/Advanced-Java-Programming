package JTABBED;

/**
 * ColorsPanel
 */

 import javax.swing.*;
public class ColorsPanel extends JPanel {

	public ColorsPanel() {
		JComboBox jcb = new JComboBox();

		jcb.addItem("Red");
		jcb.addItem("Green");
		jcb.addItem("Blue");
		jcb.addItem("Orange");

		add(jcb);
	}
}