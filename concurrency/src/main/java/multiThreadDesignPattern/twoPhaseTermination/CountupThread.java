package multiThreadDesignPattern.twoPhaseTermination;

/**
 * Created by weizwang on 2015/12/24.
 */
public class CountupThread extends Thread {
    private long counter=0;
    private volatile boolean shudownRequested=false;
    public void setShudownRequested(){
        shudownRequested=true;
        interrupt();
    }
    public boolean isShudownRequested(){
        return shudownRequested;
    }
    public final void run(){
        try {
            while (!shudownRequested){
                doWork();
            }

        }finally {
            doShutdown();
        }
    }

    private void doWork(){
        counter++;
        System.out.println("doWork: counter= "+counter);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
    private void doShutdown(){
        System.out.println("doShutdown: counter= "+counter);
    }
}
