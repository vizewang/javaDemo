package multithreadDesignPattern.guardedSuspension;

import java.util.Random;

/**
 * Created by weizwang on 2015/12/21.
 */
public class ClientThread extends Thread{
    private Random random;
    private RequestQueue requestQueue;
    public ClientThread(RequestQueue requestQueue,String name,long seed){
        super(name);
        this.requestQueue=requestQueue;
        this.random=new Random(seed);
    }
    public void run(){
        for(int i=0;i<10000;i++){
            Request request=new Request("No."+i);
            System.out.println(Thread.currentThread().getName()+" requests "+request);
            requestQueue.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
