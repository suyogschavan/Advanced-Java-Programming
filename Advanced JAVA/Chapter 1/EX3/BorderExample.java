import java.awt.*;
public class BorderExample extends Frame {

	public static void main(String[] args) {
		Frame f = new Frame();

        //Buttons
        Button b1 = new Button("NORTH");
        Button b2 = new Button("SOUTH");
        Button b3 = new Button("EAST");
        Button b4 = new Button("WEST");
        Button b5 = new Button("CENTER");

        //Adding Elements to Frame
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);
        
        f.setTitle("Experiment 3 by Suyog Chavan");
        f.setSize(300, 250);
        f.setVisible(true);
	}
}
