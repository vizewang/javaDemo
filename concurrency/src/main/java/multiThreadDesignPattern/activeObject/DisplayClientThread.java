package multiThreadDesignPattern.activeObject;

import threadPool.ThreadPool1;

/**
 * Created by vize on 2015/12/26.
 */
public class DisplayClientThread extends Thread {
    private final ActiveObject activeObject;
    public DisplayClientThread(String name,ActiveObject activeObject){
        super(name);
        this.activeObject=activeObject;
    }
    public void run(){
        try{
            for(int i=0;true;i++){
                String string= Thread.currentThread().getName()+" "+i;
                activeObject.displayString(string);
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
