
import java.awt.*;

public class Java1 extends Frame {

    public static void main(String[] args) {

// CREATING FRAME
        Frame f = new Frame();

//LABELS
        Label i1 = new Label("Name : ");
        Label i2 = new Label("Address : ");
        Label i3 = new Label("Department: ");
        Label i4 = new Label("State :");
        Label i5 = new Label("Languages: ");
        Label i6 = new Label("Gender : ");
        
//TEXT FIELD
        TextField t1 = new TextField("Text Field");
        
//TEXT AREA
        TextArea t2 = new TextArea("Text Area");

//BUTTON
        Button b = new Button("SUBMIT");
        Button b2 = new Button("Back");

//SCROLLBAR
        Scrollbar s = new Scrollbar(Scrollbar.VERTICAL);
        Scrollbar s2= new Scrollbar(Scrollbar.HORIZONTAL);

//LIST
        List l1 = new List(6);   

        l1.add("Computer");
        l1.add("Civil");
        l1.add("Machanical");
        l1.add("IT");
        l1.add("Medical");
        l1.add("Other");

//CHOICE
        Choice os = new Choice();

        os.add("Maharashtra");
        os.add("Karnataka");
        os.add("Gujrat");
        os.add("Madhya Pradesh");
        os.add("Utter Pradesh");
        os.add("Odisha");
        os.add("J & K");
        os.add("Rajasthan");
        os.add("Haryana");
        
//CHECKBOX
        Checkbox c1 = new Checkbox("C++",  false);
        Checkbox c2 = new Checkbox("JAVA", true);
        Checkbox c3 = new Checkbox("HTML", false);
        Checkbox c5 = new Checkbox("JS", true);

//CHECKBOX GROUP
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cg1 = new Checkbox("Male", cbg, true);
        Checkbox cg2 = new Checkbox("Female", cbg, false);

// Setting Bonds
        i1.setBounds(20,45,70,20);   //Label 1
        t1.setBounds(120,45, 200,20);//Text FIELD
        i2.setBounds(20, 80, 70, 20);//Label 2
        t2.setBounds(120, 80, 200,70);//Text area
        s.setBounds(460, 45, 20, 400); //scrollbar VERTICAL
        s2.setBounds( 20, 500, 450, 20);//scrollbar HORIZONTAL
        i3.setBounds(20, 170, 70, 20); //Label 3
        l1.setBounds(120, 170, 200, 80);//List
        i4.setBounds(20, 270, 70, 20); //Label 4
        os.setBounds(120, 270, 200, 20);// Choice
        i5.setBounds(20, 310, 70, 20); //Label 5
        c1.setBounds(125, 310, 70, 20); //Checkbox 1
        c2.setBounds(195, 310, 70, 20); //Checkbox 2
        c3.setBounds(265, 310, 70, 20);//Checkbox 3
        c5.setBounds(335, 310, 70, 20);// Checkbox 4 
        i6.setBounds(20, 350, 70, 20); //Label 6
        cg1.setBounds(125, 350, 70, 20);//RadioButton 1
        cg2.setBounds(125, 375, 70, 20);// RadioButton 2
        b.setBounds(220, 410, 100, 40); //Submit Button
        b2.setBounds(115, 410, 100, 40);//Back Button
       
//ADDING ELEMENTS TO FORM
        f.add(i1);      //Label 1
        f.add(t1);      //Text FIELD
        f.add(i2);      //Label 2
        f.add(t2);      //Text AREA
        f.add(i3);      //Label 3
        f.add(l1);      //List
        f.add(i4);      //Label 4
        f.add(os);      //Choice
        f.add(i5);      //Label 5
        f.add(c1);      //Checkbox
        f.add(c2);      //Checkbox
        f.add(c3);      //Checkbox
        f.add(c5);      //Checkbox
        f.add(b);       //Button
        f.add(b2);      //Button
        f.add(i6);      //Label 6
        f.add(cg1);     //Radio Button 1
        f.add(cg2);     //Radio Button 2
        f.add(s);       //Scrollbar VERTICAL
        f.add(s2);      //Scrollbar HORIZONTAL
       
        f.setSize(500,550);
        f.setTitle("Experiment 1");
        f.setLayout(null);
        f.setVisible(true);

    }
}