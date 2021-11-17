import java.awt.*;

public class GridExample extends Frame {
	
	GridExample() {

		Button b1 = new Button("Button 1");
		Button b2 = new Button("Button 2");
		Button b3 = new Button("Button 3");
		Button b4 = new Button("Button 4");
		Button b5 = new Button("Button 5");

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);

		setLayout(new GridLayout(3, 2, 15, 15));
		setVisible(true);
		setSize(400, 200);
		setTitle("Grid Layout Demo");
	}
	public static void main(String[] args) {
		new GridExample();
	}
}
