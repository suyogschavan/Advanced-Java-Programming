package EX10;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxAsSource extends JFrame {
	
	JCheckBox ch1, ch2;
	JLabel label, l1, l2;

	CheckBoxAsSource(){

		ch1 = new JCheckBox("JAVA");
		ch1.setBounds(50, 10, 100, 50);
		ch2 = new JCheckBox("C++");
		ch2.setBounds(150, 10, 100, 50);

		label = new JLabel("Selected Boxes:-- ");
		label.setBounds(50, 50, 100, 100);

		l1 = new JLabel();
		l1.setBounds(50, 100, 100, 100);

		l2 = new JLabel();
		l2.setBounds(50, 150, 100, 100);

		add(ch1);
		add(ch2);
		add(label);
		add(l1);
		add(l2);


		ch1.addItemListener(new ItemListener(){

			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==1){
					l1.setText("JAVA : Checked " );
				}
				else{
					l1.setText("JAVA : Unchecked ");
				}
			
			}

		});
		ch2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==1) {
					l2.setText("C++ : Checked ");
				}else{
					l2.setText("C++ : Unchecked ");
				}
			}
		});

		setLayout(null);
		setVisible(true);
		setTitle("CheckBox As Source of Event Handling");
		setSize(400, 450);
	}

	public static void main(String[] args) {
		new CheckBoxAsSource();
	}

}
