import java.awt.*;
public class Calculator extends Frame {
    
    Calculator(){  
//TextField
        TextField t1 = new TextField();
        add(t1);

// Buttons
    Button b1[] = new Button[15];
    Button b2[] = new Button[7];
    String op2[] = {"+","-","*","/","%","C","="};
    int k=0;

//Numerical Buttons
    for(int i=0;i<10;i++){
        
        b1[i] = new Button(""+k);
        add(b1[i]);
        k++;
        b1[i].setBackground(Color.yellow);
    }

//A. Operator Buttons
    for(int i=0;i<7;i++){

        b2[i] = new Button(""+op2[i]);
        add(b2[i]);
        b2[i].setBackground(Color.CYAN);
    }

//Setting up grid layout
    setLayout(new GridLayout(6, 3, 6, 6));

//Setting up Frame
    setTitle("Experiment 3 by Suyog_71");
    setVisible(true);
    setSize(400, 500);
    
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
