class Accout {                      /** 银行账户类 */
int money = 0;
    /* 取钱，若账户没钱，则提醒存钱，并等待；否则取钱 */
    public synchronized void saveMoney()
    {        System.out.println("准备存钱！");
        try {   if(money >=100)   {
            wait();  		//等待
        }
            money = 500;     	// 存钱
            System.out.println("存入"+money);
            notify();
        } catch(Exception e)  { }
    }
}
class ParentsThread extends Thread {
    Accout a;
    public ParentsThread(Accout a){
        this.a = a;
        start();
    }
    public void run() {
        try{  while(true) {

            Thread.sleep(12000);
            a.saveMoney(); }           //存钱
        }catch(Exception e){}
    }
}
class StudentThread extends Thread {
    Accout a;
    public StudentThread(Accout a){
        this.a = a;
        start();
    }
    public void run(){
        try{
            while(true){
                synchronized (this) {
                    Thread.sleep(2000);
                    System.out.println("准备取钱！");
                    try{  if ( money < 100 )    {
                        notify();
                        wait();     		//等待
                    }
                        money -= 100;     	//取钱
                        System.out.println("取钱100，剩余:" + money);
                    } catch(Exception e)  { } //取钱
                }           }
        }catch(Exception e){}
    }
}
public class Test {
    public static void main(String[] args) {
        Accout a = new Accout();
        StudentThread s = new StudentThread(a);
        ParentsThread g = new ParentsThread(a);
    }
}
