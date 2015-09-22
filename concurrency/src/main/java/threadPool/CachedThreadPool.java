package threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by weizwang on 2015/9/22.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService pool= Executors.newCachedThreadPool();
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        //���̷߳�����н���ִ��
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        //�ر��̳߳�
        pool.shutdown();
    }
}
