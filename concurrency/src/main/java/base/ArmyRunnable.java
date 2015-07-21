package base;

/**
 * Created by vizewang on 2015/7/21.
 */
public class ArmyRunnable implements Runnable {
    private volatile boolean keepRunning=true;

    public void run() {
        while (keepRunning){
            for(int i=0;i<5;i++){
                System.out.println(Thread.currentThread().getName()+"进攻对方["+i+"]");
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName()+"结束了战斗");
    }
}
