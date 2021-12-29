
import java.awt.*;
class But{
But()
{
                Frame f=new Frame("Suyog Chavan 71");
                Button b1=new Button("Ok");
                b1.setBounds(100,50,50,50);
                f.add(b1);
                Button b2=new Button("Reset");
                b2.setBounds(100,101,50,50);
                f.add(b2);
                Button b3=new Button("Cancel");
                b3.setBounds(100,150,50,50);
                f.add(b3);
                f.setSize(500,500);
                f.setLayout(null);
                f.setVisible(true);
}
public static void main(String a[])
{
                new But();
}
}
