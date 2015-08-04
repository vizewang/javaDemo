package threadandrunnable;

class MyThread extends Thread {
    private int ticketsCont = 5;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (ticketsCont > 0) {
            ticketsCont--;
            System.out.println(name + " 买了一张票，剩余票数为:" + ticketsCont);
        }
    }
}

/**
 * Created by vizewang on 2015/8/4.
 */
public class TicketsThread {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("窗口1");
        MyThread myThread2 = new MyThread("窗口2");
        MyThread myThread3 = new MyThread("窗口3");
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
