import javax.swing.*;
import java.awt.*;

public class ComboExample extends JFrame {
	
		ComboExample(){
			
			String states[]={"Maharashtra", "Gujrat", "Karnataka", "Rajasthan", "Kerala"};

			JComboBox cb = new JComboBox(states);
			add(cb);

			setLayout(new FlowLayout());
			setSize(400, 500);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}

		public static void main(String[] args) {
			new ComboExample();
		}
}
