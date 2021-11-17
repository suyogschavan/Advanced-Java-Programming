import java.awt.*;

public class ActivityI extends Frame{

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		List l = new List(3);

		l.add("Summer");
		l.add("Winter");
		l.add("Rainy");

		l.setBounds(120, 170, 200, 80);

		frame.add(l);

		frame.setTitle("Activity 1");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400, 400);
		
	}
	
}
