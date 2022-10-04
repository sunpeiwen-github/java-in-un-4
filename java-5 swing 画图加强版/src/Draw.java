import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Draw {
    JButton circle,line,rectangle;
    JMenuBar menubar;
    JMenu menu;
    JMenuItem circle1,line1,rectangle1;
    JToolBar toolbar;
    JFrame jf;
    //   Graphics g;
    int last_x=0,last_y=0;
    int last_x1=0,last_y1=0,last_x2=0,last_y2=0;
    int flag,choose;
    Draw()
    {
        circle =new JButton("圆");
        line =new JButton("线");
        rectangle=new JButton("矩形");
        jf=new JFrame();
        menubar=new JMenuBar();
        menu=new JMenu("菜单栏");
        circle1=new JMenuItem("画圆");
        line1=new JMenuItem("画线");
        rectangle1=new JMenuItem("画矩形");
        toolbar=new JToolBar();
        jf.setJMenuBar(menubar);
        menubar.setVisible(true);
        menu.setVisible(true);
        toolbar.setVisible(true);

        menubar.add(menu);
        menu.add(circle1);
        menu.add(line1);
        menu.add(rectangle1);
        jf.add(toolbar);

        //  g=p2.getGraphics();//为什么式空指针
        // g.setColor(Color.blue);
        toolbar.add(circle);
        toolbar.add(line);
        toolbar.add(rectangle);
        jf.setLayout(new FlowLayout());

        //  jf.setResizable(false);
        jf.setSize(500,500);
        jf.setDefaultCloseOperation(3);
        jf.setVisible(true);
        jf.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(flag==0)
                {
                    last_x1=e.getX();
                    last_y1=e.getY();
                    flag++;
                }
                else
                {
                    last_x2=e.getX();
                    last_y2=e.getY();
                    if(choose==1)
                    {
                        Graphics g=jf.getGraphics();
                        g.drawLine(last_x1,last_y1,last_x2,last_y2);
                        flag=0;
                    }
                    else if(choose==2)
                    {
                        Graphics g=jf.getGraphics();
                        int r=(int)Math.sqrt((last_x1-last_x2)*(last_x1-last_x2)+(last_y1-last_y2)*(last_y1-last_y2));

                        g.drawOval(last_x1-r,last_y1-r,2*r,2*r);
                        flag=0;
                    }
                    else if(choose==3)
                    {
                        Graphics g=jf.getGraphics();
                        int wide=Math.abs(last_x2-last_x1);
                        int high=Math.abs(last_y1-last_y2);
                        g.drawRect(last_x1,last_y1,wide,high);
                        flag=0;
                    }
                }
            }

        });
        circle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=0;
                choose=2;
            }
        });
        circle1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=0;
                choose=2;
            }
        });
        line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=0;
                choose=1;
            }
        });
        line1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=0;
                choose=1;
            }
        });
        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=0;
                choose=3;
            }
        });
        rectangle1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flag=0;
                choose=3;
            }
        });
    }
    public static void main(String []args)
    {
        new Draw();
    }

}
