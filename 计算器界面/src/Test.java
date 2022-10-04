import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

class Interface//界面
{
    Interface() {
        JFrame f= new JFrame("计算器");
        f.setSize(390,220);//调用对象 和他们的组件
        Panel1 p1=new Panel1();
        Panel2 p2=new Panel2();
        Panel3 p3=new Panel3();
        Panel4 p4=new Panel4();
        Panel5 p5=new Panel5();
        JPanel high=new JPanel();//将页面分为上中下三个区域面板
        JPanel mid=new JPanel();
        JPanel low=new JPanel();

        f.setLayout(new BorderLayout(0,-10));
        f.add(BorderLayout.SOUTH,low);
        f.add(BorderLayout.NORTH,high);
        f.add(BorderLayout.CENTER,mid);
        low.add(p2.mb());//直接添加没有 添加布局对象
        low.add(p1.mb());
        mid.add(p5.mb());
        mid.add(p3.mb());
        high.add(p4.mb());
        f.setResizable(false);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
class Panel1
{
    JPanel p1= new JPanel();
    Panel1()
    {
        p1.setSize(300,100);
        //  p1.setBackground(Color.blue);
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
    }
    JPanel mb()
    {
        return p1;
    }
}
class Panel2
{
    JPanel p1= new JPanel();
    Panel2()
    {
        p1.setSize(100,100);
        //  p1.setBackground(Color.blue);
        JButton b1=new JButton("MC");
        JButton b2=new JButton("MR");
        JButton b3=new JButton("MS");
        JButton b4=new JButton("M+");
        p1.setLayout(new GridLayout(4,1));
        p1.add(b1);p1.add(b2);
        p1.add(b3);p1.add(b4);
    }
    JPanel mb()
    {
        return p1;
    }
}
class Panel3
{
    JPanel p1= new JPanel();
    Panel3()
    {
        p1.setSize(300,100);
        //  p1.setBackground(Color.blue);
        JButton b1=new JButton("Backspace");
        JButton b2=new JButton("CE");
        JButton b3=new JButton("C");
        p1.setLayout(new GridLayout(1,3));
        p1.add(b1);p1.add(b2);
        p1.add(b3);
    }
    JPanel mb()
    {
        return p1;
    }
}
class Panel4
{
    JPanel p1=new JPanel();
    Panel4()
    {
        p1.setSize(400,100);
        JTextField jtf=new JTextField(30);
        jtf.setSize(400,100);
        p1.add(jtf);
    }
    JPanel mb(){return p1;}
}
class Panel5
{
    JPanel p1= new JPanel();
    Panel5()
    {
        p1.setSize(100,100);
        JButton b1=new JButton("  ");
        Border border=BorderFactory.createBevelBorder(1);
        p1.setBorder(border);
        p1.add(b1);
    }
    JPanel mb()
    {
        return p1;
    }
}
public class Test {
    public static void main(String []args)
    {
        Interface jm=new Interface();
    }
}
