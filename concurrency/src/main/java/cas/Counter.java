package cas;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by vize on 2015/12/19.
 */
public class Counter {
    private AtomicInteger atomicI=new AtomicInteger(0);
    private int i=0;

    public static void main(String[] args) {
        final Counter cas=new Counter();
        List<Thread> ts=new ArrayList<Thread>(600);
        long start=System.currentTimeMillis();
        for(int j=0;j<100;j++){
            Thread t=new Thread(new Runnable() {
                public void run() {
                    for(int i=0;i<10000;i++){
                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            ts.add(t);
        }
        for(Thread t:ts){
            t.start();
        }
        for(Thread t:ts){
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(cas.i);
        System.out.println(cas.atomicI.get());
        System.out.println(System.currentTimeMillis()-start);
    }
private void safeCount(){
    for(;;){
        int i=atomicI.get();
        boolean suc=atomicI.compareAndSet(i,++i);
        if(suc){
            break;
        }
    }
}
    private void count() {
        i++;
    }
}