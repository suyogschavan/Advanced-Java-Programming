import javax.swing.*;
import java.awt.event.*;

public class CheckBoxEVENT extends JFrame{

	JCheckBox ch1, ch2;
	JLabel l, l1, l2;

	CheckBoxEVENT(){
//JCheckBox
		ch1 = new JCheckBox("JAVA");
		ch1.setBounds(52, 10, 80, 25);
		ch2 = new JCheckBox("C++");
		ch2.setBounds(130, 10, 100, 25);

//JLabels
		l = new JLabel("Current Selection");
		l.setBounds(20, 75, 100, 25);
		l1 = new JLabel();
		l1.setBounds(20, 125, 200, 100);
		l2 = new JLabel();
		l2.setBounds(20, 150, 200, 100);

//Adding to Frame
		add(ch1);
		add(ch2);
		add(l);
		add(l1);
		add(l2);

//Setting Frame properties		
		setLayout(null);
		setVisible(true);
		setSize(455, 400);
		setTitle("CheckBox Event Handling");
	
//Adding ItemListener to checkbox1
		ch1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				l1.setText("JAVA checkbox :"+(e.getStateChange()==1? "Checked":"unchecked"));
			}
		});

//Adding ItemListener to checkbox2
		ch2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				l2.setText("C++ checkbox :"+(e.getStateChange()==1? "Checked":"unchecked"));
			}
		});	
	}

	public static void main(String[] args) {
	
		new CheckBoxEVENT();
	}
} 