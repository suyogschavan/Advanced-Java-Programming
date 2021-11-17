import javax.swing.*;
import java.awt.*;

public class qA extends JFrame {
	
	qA(){
		MenuBar mb = new MenuBar();
		setMenuBar(mb);

		Menu menu1 = new Menu("File");
		Menu menu2 = new Menu("Edit");
		Menu menu3 = new Menu("Help");

		mb.add(menu1);
		mb.add(menu2);
		mb.add(menu3);

		MenuItem menuItem1 = new MenuItem("Open");
		MenuItem menuItem2 = new MenuItem("Close");
		MenuItem menuItem3 = new MenuItem("Copy");
		
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu2.add(menuItem3);
		
	}
	public static void main(String[] args) {
		qA obj = new qA();
		obj.setVisible(true);
		obj.setSize(400, 300);
		obj.setTitle("Experiment 5 Suyog");
	}
}
