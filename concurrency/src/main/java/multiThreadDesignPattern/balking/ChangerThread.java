package multiThreadDesignPattern.balking;

import java.io.IOException;
import java.util.Random;

/**
 * Created by vize on 2015/12/21.
 */
public class ChangerThread extends Thread {
    private Data data;
    private Random random=new Random();
    public ChangerThread(String name,Data data){
        super(name);
        this.data=data;
    }
    public void run(){
        for(int i=0;true;i++){
            data.change("NO."+i);
            try {
                Thread.sleep(random.nextInt(1000));
                data.save();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
