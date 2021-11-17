import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class JtreeEx2 extends JFrame {

	JtreeEx2(){
		
		DefaultMutableTreeNode Country = new DefaultMutableTreeNode("India");

		DefaultMutableTreeNode Maha = new DefaultMutableTreeNode("Maharashtra");
		Country.add(Maha);
		Country.add(new DefaultMutableTreeNode("Gujrat"));
		
		Maha.add(new DefaultMutableTreeNode("Mumbai"));
		Maha.add(new DefaultMutableTreeNode("Pune"));
		Maha.add(new DefaultMutableTreeNode("Nashik"));
		Maha.add(new DefaultMutableTreeNode("Nagpur"));

		JTree tree = new JTree(Country);

		add(tree);

		setVisible(true);
		setSize(400, 350);
		setTitle("Experiment 7 by Suyog Chavan");
	}

	public static void main(String[] args) {
		new JtreeEx2();
	}
	
}
