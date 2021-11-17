import java.awt.*;

public class ActivityII {
	
	public static void main(String[] args) {
		
		Frame frame = new Frame();

		Label l1 = new Label("Select Subjects you like");

		Choice ch = new Choice();

		ch.add("Maths");
		ch.add("Phisics");
		ch.add("C++");
		ch.add("Java");

		ch.setBounds(120, 170, 200, 80);
		l1.setBounds(120, 200, 200, 80);

		frame.add(ch);
		frame.add(l1);

		frame.setTitle("Activity 2");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setSize(400, 400);
		
	}
	}

