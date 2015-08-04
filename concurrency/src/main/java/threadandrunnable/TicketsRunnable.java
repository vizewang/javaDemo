package threadandrunnable;

class MyThread1 implements Runnable{
private int ticketsCont=5;

        public void run() {
            while (ticketsCont > 0) {
                ticketsCont--;
                System.out.println( Thread.currentThread().getName()+ " 买了一张票，剩余票数为:" + ticketsCont);
            }
        }
}
/**
 * Created by vizewang on 2015/8/4.
 */
public class TicketsRunnable {
    public static void main(String[] args) {
        MyThread1 mt=new MyThread1();
        Thread th1=new Thread(mt,"窗口1");
        Thread th2=new Thread(mt,"窗口2");
        Thread th3=new Thread(mt,"窗口3");
        th1.start();
        th2.start();
        th3.start();
    }
}
