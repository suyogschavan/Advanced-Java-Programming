import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeExample extends JFrame {

	JTreeExample(){

		DefaultMutableTreeNode node = new DefaultMutableTreeNode("Node");
		JTree tree = new JTree(node);

		DefaultMutableTreeNode node1 = new DefaultMutableTreeNode("Node1");
		DefaultMutableTreeNode node2 = new DefaultMutableTreeNode("Node2");
		DefaultMutableTreeNode node3 = new DefaultMutableTreeNode("Node3");
		node.add(node1);
		node.add(node2);
		node.add(node3);

		DefaultMutableTreeNode treenode2 = new DefaultMutableTreeNode("Tree1");
		DefaultMutableTreeNode treenode3 = new DefaultMutableTreeNode("Tree2");

		node1.add(treenode2);
		node1.add(treenode3);
		
		node2.add(new DefaultMutableTreeNode("Hii"));
		node2.add(new DefaultMutableTreeNode("Hello"));
		node2.add(new DefaultMutableTreeNode("How are you?"));

		node3.add(new DefaultMutableTreeNode("Suyog"));
		node3.add(new DefaultMutableTreeNode("Advanced Java"));

		add(tree);
		

		setSize(300, 250);
		setVisible(true);
		setTitle("Experiment 8 - Tree Example ");
	}
	public static void main(String[] args) {
		new JTreeExample();
	}
	
}
