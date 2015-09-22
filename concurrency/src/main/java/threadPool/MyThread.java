package threadPool;

/**
 * Created by weizwang on 2015/9/22.
 */
public class MyThread extends Thread {
   @Override
    public void run(){
       System.out.println(Thread.currentThread().getName()+"正在执行...");
   }
}
