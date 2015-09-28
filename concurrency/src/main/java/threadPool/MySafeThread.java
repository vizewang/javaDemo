package threadPool;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by weizwang on 2015/9/22.
 */

public class MySafeThread implements Runnable {
    private static AtomicInteger count=new AtomicInteger(0);
    private int threadCount=0;
    private static AtomicBoolean flag=new AtomicBoolean(true);
    private static int num=1;
    public static void calc(){
        while((count.get())<1000)
        {
            count.incrementAndGet();//自增1,返回更新值
            System.out.println("正在运行是线程" + Thread.currentThread().getName() + ":" + count);
        }
        flag.set(false);
    }
    public synchronized void run() {
        while(flag.get())
        {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            MySafeThread.calc();
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            Thread mySafeThread=new Thread(new MySafeThread());
            mySafeThread.start();
        }
        System.out.println("end");
    }
}
