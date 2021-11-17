package JTABBED;
import javax.swing.*;

public class JTabbedPaneEx extends JFrame{

	JTabbedPaneEx(){
		JTabbedPane jtp = new JTabbedPane();

	//Creation of Tabs
		jtp.addTab("Cities", new CitiesPanel());
		jtp.addTab("Colores", new ColorsPanel());
		jtp.addTab("Flavors", new FlavorsPanel());
	//Adding to frame
		add(jtp);
	
		setTitle("Experiment 7 by Suyog");
		setVisible(true);
		setSize(400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTabbedPaneEx();
	}
}

