package stack;

public class Calculator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String expression = "5+6*7-4/2"; //如何处理多位数的问题？
        //创建两个栈，数栈，一个符号栈
        ArrayStack2 numStack = new ArrayStack2(10);
        ArrayStack2 operStack = new ArrayStack2(10);
        //定义需要的相关变量
        int index = 0;//辅助指针，扫描expression
        int num1 = 0;
        int num2 = 0;
        int oper = 0;
        int res = 0;
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
                    numStack.push(Integer.parseInt(keepNum));
                }else{
                    //看后面字符
                    //判断下一个字符是不是数字，如果是数字，就继续扫描，如果是运算符，则入栈
                    //注意是看后一位，不是index++
                    if (operStack.isOper(expression.substring(index+1,index+2).charAt(0))) {
                        //如果后一位是运算符，则入栈 keepNum = "1" 或者 "123"
                        numStack.push(Integer.parseInt(keepNum));
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
        int res2 = numStack.pop();
        System.out.printf("表达式 %s = %d", expression, res2);
    }//main
}//主类

//定义一个类表示栈
class ArrayStack2{
    private int maxSize;//表示栈的大小  应该是maxsize-1
    private int[] stack;//数组存栈
    private int top = -1;//初始化top

    //构造器
    public ArrayStack2(int maxSize){
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
    //遍历  需要从栈顶开始显示
    public void list() {
        if(isEmpty()) {
            System.out.println("栈空，没有数据！！");
            return;
        }
        for(int i =top;i>=0;i--) {
            System.out.printf("stack[%d] = %d \n",i,stack[i]);
        }
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

    //计算方法
    public int cal(int num1,int num2,int oper) {
        int res = 0;//用于存放计算结果
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