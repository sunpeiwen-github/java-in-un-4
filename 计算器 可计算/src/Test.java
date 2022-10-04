import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

class Interface//界面
{
    String expression="";
    Interface() {
        JFrame f= new JFrame("计算器");
        f.setSize(390,220);
        Panel1 p1=new Panel1();//调用对象 和他们的组件
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
        p1.b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               expression+="7";
               p4.jtf.setText(expression);
            }
        });
        p1.b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="8";
                p4.jtf.setText(expression);
            }
        });
        p1.b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="9";
                p4.jtf.setText(expression);
            }
        });
        p1.b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="/";
                p4.jtf.setText(expression);
            }
        });
        p1.b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="4";
                p4.jtf.setText(expression);
            }
        });
        p1.b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="5";
                p4.jtf.setText(expression);
            }
        });
        p1.b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="6";
                p4.jtf.setText(expression);
            }
        });
        p1.b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="*";
                p4.jtf.setText(expression);
            }
        });
        p1.b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="1";
                p4.jtf.setText(expression);
            }
        });p1.b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="2";
                p4.jtf.setText(expression);
            }
        });
        p1.b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="3";
                p4.jtf.setText(expression);
            }
        });
        p1.b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="-";
                p4.jtf.setText(expression);
            }
        });
        p1.b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="0";
                p4.jtf.setText(expression);
            }
        });
        p1.b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+=".";
                p4.jtf.setText(expression);
            }
        });
        p1.b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression+="+";
                p4.jtf.setText(expression);
            }
        });
        p1.b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // p4.jtf.setText(expression);
                String expression1=new String(p4.jtf.getText());
                Calculator calculator=new Calculator(expression1);
                p4.jtf.setText(calculator.result());
                expression="";
            }
        });
        p3.b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                expression="";
                p4.jtf.setText(expression);
            }
        });

    }

}
class Panel1
{
    JPanel p1= new JPanel();
    JButton b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    Panel1()
    {
        p1.setSize(300,100);
        //  p1.setBackground(Color.blue);
        b1=new JButton("7");
        b2=new JButton("8");
        b3=new JButton("9");
        b4=new JButton("/");
        b5=new JButton("sqrt");
        b6=new JButton("4");
        b7=new JButton("5");
        b8=new JButton("6");
        b9=new JButton("*");
        b10=new JButton("%");
        b11=new JButton("1");
        b12=new JButton("2");
        b13=new JButton("3");
        b14=new JButton("-");
        b15=new JButton("1/x");
        b16=new JButton("0");
        b17=new JButton("+/-");
        b18=new JButton(".");
        b19=new JButton("+");
        b20=new JButton("=");
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
    JButton b1,b2,b3,b4;
    Panel2()
    {
        p1.setSize(100,100);
        //  p1.setBackground(Color.blue);
        b1=new JButton("MC");
        b2=new JButton("MR");
        b3=new JButton("MS");
        b4=new JButton("M+");
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
    JButton b1,b2,b3;
    Panel3()
    {
        p1.setSize(300,100);
        //  p1.setBackground(Color.blue);
        b1=new JButton("Backspace");
        b2=new JButton("CE");
        b3=new JButton("C");
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
    JTextField jtf;
    Panel4()
    {
        p1.setSize(400,100);
        jtf=new JTextField(30);
        jtf.setSize(400,100);
        p1.add(jtf);
    }
    JPanel mb(){return p1;}
}
class Panel5
{
    JPanel p1= new JPanel();
    JButton b1;
    Panel5()
    {
        p1.setSize(100,100);
        b1=new JButton("  ");
        Border border=BorderFactory.createBevelBorder(1);
        p1.setBorder(border);
        p1.add(b1);
    }
    JPanel mb()
    {
        return p1;
    }
}
 class Calculator {
    float res2;
    Calculator(String expression) {
        // TODO Auto-generated method stub
      //  String expression = "5+6*7-4/2"; //如何处理多位数的问题？
        //创建两个栈，数栈，一个符号栈
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack1 operStack = new ArrayStack1(10);
        //定义需要的相关变量
        int index = 0;//辅助指针，扫描expression
        float num1 = 0;
        float num2 = 0;
        int oper = 0;
        float res = 0;
        char ch = ' '; //将每次扫描得到char保存到ch
        String keepNum = ""; //用于拼接 多位数
        //开始while循环的扫描expression
        while(true) {
            //依次得到expression 的每一个字符
            ch = expression.substring(index, index+1).charAt(0);
            //charAt(0)将字符串转化为char substring方法从index开始到index+1
            //判断ch是什么，然后做相应的处理
            if(operStack.isOper(ch)) {//如果是运算符
                //判断当前的符号栈是否为空
                if(!operStack.isEmpty()) {
                    //如果符号栈有运算符，进行比较，如果当前运算符的优先级小于或等于栈顶的运算符
                    // 数值栈pop出俩个数，符号栈pop出一个符号，进行运算，将得到的结果人数值栈，当前符号入符号栈
                    if(operStack.priority(ch) <= operStack.priority(operStack.peek())) {
                        num1 = numStack.pop();
                        num2 = numStack.pop();
                        oper = operStack.pop();
                        res = numStack.cal(num1, num2, oper);
                        //把运算的结果如数栈
                        numStack.push(res);
                        //然后将当前的操作符入符号栈
                        operStack.push(ch);
                    } else {
                        //如果当前的操作符的优先级大于栈中的操作符， 就直接入符号栈.
                        operStack.push(ch);
                    }
                }else {
                    //如果为空直接入符号栈..
                    operStack.push(ch); // 1 + 3
                }
            } else { //如果是数，则直接入数栈
                //如果是数，直接入数值栈
                //但此时得到的数是字符 ASCII值是  num+48
                //numStack.push(ch-48);
                //1.当处理多位数，不能扫描到一个数就入栈，可能是多位数，
                //2.后面如果是数，继续扫描，如果是符号，就入栈
                //3.定义一个字符串，存储多位数
                //处理多位数
                keepNum += ch;

                //如果ch已经是expression的最后一位，就直接入栈
                if (index == expression.length() - 1) {
                    numStack.push(Float.parseFloat(keepNum));
                }else{
                    //看后面字符
                    //判断下一个字符是不是数字，如果是数字，就继续扫描，如果是运算符，则入栈
                    //注意是看后一位，不是index++
                    if (operStack.isOper(expression.substring(index+1,index+2).charAt(0))) {
                        //如果后一位是运算符，则入栈 keepNum = "1" 或者 "123"
                        numStack.push(Float.parseFloat((keepNum)));
                        //重要的!!!!!!, keepNum清空,以便下次使用
                        keepNum = "";

                    }
                }
            }
            //让index + 1, 并判断是否扫描到expression最后.
            index++;
            if (index >= expression.length()) {
                break;
            }
        }

        //退出while
        //1.当表达式扫描完毕后，就顺序从数值栈和符号栈pop出相应数值符号，运算
        //2.当数值栈只有一个数，符号栈没有，数值栈里的数值就是最后结果
        while(true) {
            //如果符号栈为空，则计算到最后的结果, 数栈中只有一个数字【结果】
            if(operStack.isEmpty()) {
                break;
            }
            num1 = numStack.pop();
            num2 = numStack.pop();
            oper = operStack.pop();
            res = numStack.cal(num1, num2, oper);
            numStack.push(res);//入栈
        }
        //将数栈的最后数，pop出，就是结果
         res2 = numStack.pop();
        System.out.printf("表达式 %s = %f", expression, res2);
    }//main
     String result()
     {
         return Float.toString(res2);
     }
}//主类
//存储运算符号的栈
class ArrayStack1{
    private int maxSize;//表示栈的大小  应该是maxsize-1
    private int[] stack;//数组存栈
    private int top = -1;//初始化top

    //构造器
    public ArrayStack1(int maxSize){
        this.maxSize = maxSize;
        stack = new int [this.maxSize];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize -1;
    }
    //栈空
    public boolean isEmpty() {
        return top == -1;
    }
    //入栈
    public void push(int value) {
        if(isFull()) {
            System.out.println("栈满！！");
            return;
        }
        top++;
        stack[top] = value;
    }
    //出站
    public int pop() {

        if(isEmpty()) {
            System.out.println("栈空，没有数据！！");
            return 0;
            //throw new RuntimeException("空栈！");
        }

        int value  = stack[top];
        top --;
        return value;
    }


    //增加一个方法，返回当前栈顶的值，但不是真的pop
    public int peek() {
        return stack[top];
    }
    //返回运算符的优先级，优先级是由程序员来确定，数值越大，优先级越高
    public int priority(int oper) {
        if(oper == '*'||oper=='/') {
            return 1;
        }else if(oper == '+'||oper =='-') {
            return 0;
        }else {
            return -1;//目前只包含加减乘除四则运算！！！
        }
    }

    //判断是不是一个运算符
    public boolean isOper(char val) {
        return val == '+'||val == '-'||val == '*'||val == '/';
    }


}
//定义一个类表示栈 存储数字
class ArrayStack2{
    private int maxSize;//表示栈的大小  应该是maxsize-1
    private float[] stack;//数组存栈
    private int top = -1;//初始化top

    //构造器
    public ArrayStack2(int maxSize){
        this.maxSize = maxSize;
        stack = new float [this.maxSize];
    }

    //栈满
    public boolean isFull() {
        return top == maxSize -1;
    }
    //栈空
    public boolean isEmpty() {
        return top == -1;
    }
    //入栈
    public void push(float value) {
        if(isFull()) {
            System.out.println("栈满！！");
            return;
        }
        top++;
        stack[top] = value;
    }
    //出站
    public float pop() {

        if(isEmpty()) {
            System.out.println("栈空，没有数据！！");
            return 0;
            //throw new RuntimeException("空栈！");
        }

        float value  = stack[top];
        top --;
        return value;
    }


    //计算方法
    public float cal(float num1,float num2,int oper) {
        float res = 0;//用于存放计算结果
        switch (oper) {
            case '+':
                res = num1+num2;
                break;
            case '-':
                res = num2-num1;//后弹出来的是减数 num2
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2/num1;
                break;
            default:
                break;
        }
        return res;
    }


}//
public class Test {
    public static void main(String []args)
    {
        Interface jm=new Interface();
    }
}
