package waitandnotify;

import threadPool.MyThread;

/**
 * Created by weizwang on 2015/12/29.
 */
public class MyThreadPrinter2 implements Runnable {
    private String name;
    private Object prev;
    private Object self;
    private MyThreadPrinter2(String name,Object prev,Object self){
        this.name=name;
        this.prev=prev;
        this.self=self;
    }
    public void run() {
        int count=10;
        while (count>0){
            synchronized (prev){
                synchronized (self){
                    System.out.println(name);
                    count--;
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Object a=new Object();
        Object b=new Object();
        Object c=new Object();
        MyThreadPrinter2 pa=new MyThreadPrinter2("A",c,a);
        MyThreadPrinter2 pb=new MyThreadPrinter2("B",a,b);
        MyThreadPrinter2 pc=new MyThreadPrinter2("C",b,c);
        new Thread(pa).start();
        new Thread(pb).start();
        new Thread(pc).start();
    }
}
