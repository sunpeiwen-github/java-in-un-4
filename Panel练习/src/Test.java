import javax.swing.*;
import java.awt.*;

class Panel1
{
    Panel1()
    {
        JFrame f=new JFrame("第一容器");//无名 一个中介
        f.setSize(300,200);

        JPanel p1= new JPanel();
        p1.setSize(100,100);
      //  p1.setBackground(Color.blue);

        f.add(p1);

        JButton b1=new JButton("7");
        JButton b2=new JButton("8");
        JButton b3=new JButton("9");
        JButton b4=new JButton("/");
        JButton b5=new JButton("sqrt");
        JButton b6=new JButton("4");
        JButton b7=new JButton("5");
        JButton b8=new JButton("6");
        JButton b9=new JButton("*");
        JButton b10=new JButton("%");
        JButton b11=new JButton("1");
        JButton b12=new JButton("2");
        JButton b13=new JButton("3");
        JButton b14=new JButton("-");
        JButton b15=new JButton("1/x");
        JButton b16=new JButton("0");
        JButton b17=new JButton("+/-");
        JButton b18=new JButton(".");
        JButton b19=new JButton("+");
        JButton b20=new JButton("=");
        p1.setLayout(new GridLayout(4,5));
        p1.add(b1);p1.add(b2);
        p1.add(b3);p1.add(b4);
        p1.add(b5);p1.add(b6);
        p1.add(b7);p1.add(b8);
        p1.add(b9);p1.add(b10);
        p1.add(b11);p1.add(b12);
        p1.add(b13);p1.add(b14);
        p1.add(b15);p1.add(b16);
        p1.add(b17);p1.add(b18);
        p1.add(b19);p1.add(b20);




        f.setVisible(true);
    }
}
class Panel2
{

}
public class Test {
    public static void main(String[]args)
    {
        Panel1 pp=new Panel1();
    }
}
