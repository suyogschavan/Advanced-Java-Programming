
import java.awt.*;

class L {

public static void main(String a[])
{
    Frame f=new Frame("Suyog Chavan");
    Label l1=new Label("Welcome to Java");
l1.setBounds(100,50,120,80);
f.add(l1);
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
}
}