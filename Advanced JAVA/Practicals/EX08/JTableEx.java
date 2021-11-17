import javax.swing.*;

public class JTableEx extends JFrame {

	JTableEx() {
		String[] colHeads = {"Name", "roll no", "ID"};

		Object[][] data ={
			{"Suyog", "777", "333"}, {"Suyog", "777", "333"},
			{"Suyog", "777", "333"}, {"Suyog", "777", "333"}
		};

		JTable table = new JTable(data, colHeads);

		JScrollPane scrollPane = new JScrollPane(table);

		add(scrollPane);

		setVisible(true);
		setTitle("Suyog JTable");
		setSize(400, 350);


	}
	public static void main(String[] args) {
		new JTableEx();
	}
}
