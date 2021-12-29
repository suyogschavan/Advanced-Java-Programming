import javax.swing.*;
public class MenuEx extends JFrame {
	
	MenuEx(){
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new JMenu("COLORS");
		menuBar.add(menu);

		JMenuItem m1 = new JMenuItem("RED");
		JMenuItem m2 = new JMenuItem("BLUE");
		JMenuItem m3 = new JMenuItem("YELLOW");
		JMenuItem m4 = new JMenuItem("BLACK");
		JMenuItem m5 = new JMenuItem("WHITE");

		m4.setEnabled(false);	// disabled option BLACK

		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		menu.add(m4);
		menu.add(m5);

		setVisible(true);
		setTitle("Experiment 5 by Suyog");
		setSize(300, 400);
		
	}
	public static void main(String[] args) {
		new MenuEx();
	}
}
