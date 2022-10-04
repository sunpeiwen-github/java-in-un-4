import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Draw {
    JButton circle,line,rectangle;
    JPanel p1,p2;
    JTextField t1,t2;
    JLabel l1,l2,l3;
    JFrame jf;
 //   Graphics g;
    int last_x=0,last_y=0;
    int last_x1=0,last_y1=0,last_x2=0,last_y2=0;
    Draw()
    {
        circle =new JButton("圆");
        line =new JButton("线");
        rectangle=new JButton("矩形");
        t1=new JTextField(5);
        t2=new JTextField(5);
        l1=new JLabel("矩形的长(圆的半径)");
        l2=new JLabel("矩形的宽");
        l3=new JLabel("先输入数据再点按钮 选线时按住鼠标拖拽到终点松开再点击按钮");
        jf=new JFrame();
        p1=new JPanel();
        p2=new JPanel();
        p2.setBackground(Color.white);
        p2.setForeground(Color.blue);
      //  g=p2.getGraphics();//为什么式空指针
       // g.setColor(Color.blue);  
        p1.add(circle);
        p1.add(line);
        p1.add(rectangle);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p2.add(l3);

        jf.setLayout(new BorderLayout());
        jf.add(BorderLayout.NORTH,p1);
        jf.add(BorderLayout.CENTER,p2);



      //  jf.setResizable(false);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
        p2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                last_x=e.getX();
                last_y=e.getY();
            }
        });
        p2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                last_x1=e.getX();
                last_y1=e.getY();
            }
        });
        p2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                last_x2=e.getX();
                last_y2=e.getY();
            }
        });
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r=Integer.parseInt(t1.getText());
                System.out.println(r);
                Graphics g=p2.getGraphics();
                g.setColor(Color.blue);
                g.drawOval(last_x,last_y,r,r);
            }
        });
        line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g=p2.getGraphics();
                g.drawLine(last_x1,last_y1,last_x2,last_y2);
            }
        });
        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                Graphics g=p2.getGraphics();
                g.drawRect(last_x,last_y,a,b);
            }
        });



    }
    public static void main(String []args)
    {
        new Draw();
    }

}
