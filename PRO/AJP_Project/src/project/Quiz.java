package project;

// Advanced GUI from JAVA
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class Quiz extends JFrame implements ActionListener{
    
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 20;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    String enrollment;
    Quiz(String username, String enrollment){
        this.username = username;
        this.enrollment = enrollment;
        setBounds(250, 50, 1440, 950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon("H:/DOCUMENTS/Nothing/JAVA_Project_3/quiz.jpg");
        JLabel l1 = new JLabel();
        l1.setIcon(i1);
        l1.setBounds(0, 0, 1440, 392);
        add(l1);
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(100, 450, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(150, 450, 900, 30);
        add(question);
        
        q[0][0] = "Which of the following class is derived from the container class?";
        q[0][1] = "Component";
        q[0][2] = "Panel";
        q[0][3] = "MenuComponent";
        q[0][4] = "List";

        q[1][0] = "Which abstract class is the super class of all menu related classes?";
        q[1][1] = "MenuComponent";
        q[1][2] = "MenuBar";
        q[1][3] = "MenuItem";
        q[1][4] = "CheckboxMenuItem";

        q[2][0] = "Which is the container that doesn't contain title bar and MenuBars?";
        q[2][1] = "Window";
        q[2][2] = "Frame";
        q[2][3] = "Panel";
        q[2][4] = "Container";

        q[3][0] = "Give the abbreviation of AWT?";
        q[3][1] = "Applet Windowing Toolkit";
        q[3][2] = "Abstract Window Toolkit";
        q[3][3] = "Absolute Windowing Toolkit";
        q[3][4] = "None of the above";

        q[4][0] = " Which method can set or change the text in a Label?";
        q[4][1] = "setText()";
        q[4][2] = "getText()";
        q[4][3] = "addText()";
        q[4][4] = "None of the above";

        q[5][0] = "Which are passive controls that do not support any interaction with the user?";
        q[5][1] = "Choice";
        q[5][2] = "List";
        q[5][3] = "Labels";
        q[5][4] = "CheckBox";

        q[6][0] = "Which package provides many event classes and Listener interfaces for event handling?";
        q[6][1] = "java.awt";
        q[6][2] = "java.awt.Graphics";
        q[6][3] = "java.awt.event";
        q[6][4] = "none of the above";

        q[7][0] = "Which class provides many methods for graphics programming?";
        q[7][1] = "java.awt.Graphics";
        q[7][2] = "java.Graphics";
        q[7][3] = "java.awt";
        q[7][4] = "javax.swing.Graphics";

        q[8][0] = "_______ is used for GUI programming in java.";
        q[8][1] = "AWT";
        q[8][2] = "AVT";
        q[8][3] = "Swt";
        q[8][4] = "String";

        q[9][0] = " The Swing Component classes that are used in Encapsulates a mutually exclusive set of buttons?";
        q[9][1] = "Abstract Buttons";
        q[9][2] = "ButtonGroup";
        q[9][3] = "JButton";
        q[9][4] = "ImageIcon";
        
        //answer 
        qa[0][1] = "Panel";
        qa[1][1] = "MenuBar";
        qa[2][1] = "Panel";
        qa[3][1] = "Abstract Window Toolkit";
        qa[4][1] = "setText()";
        qa[5][1] = "Labels";
        qa[6][1] = "java.awt.event";
        qa[7][1] = "java.awt.Graphics";
        qa[8][1] = "AWT";
        qa[9][1] = "ButtonGroup";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 520, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 560, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 600, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 640, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);



        
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(1100, 550, 200, 40);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.setBounds(1100, 630, 200, 40);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(1100, 710, 200, 40);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            try {
                new Score(username, enrollment, score).setVisible(true);
            } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 1100, 500);
        }else {
            g.drawString("Times Up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 20;
        }else if(timer < 0){
            timer = 20;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                try {
                    new Score(username, enrollment, score).setVisible(true);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    public static void main(String[] args){
        new Quiz("", "").setVisible(true);
    }
}
