package multiThreadDesignPattern.twoPhaseTermination;

/**
 * Created by weizwang on 2015/12/24.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("main:BEGIN");
        try {
            CountupThread t=new CountupThread();
            t.start();
            Thread.sleep(10000);
            System.out.println("main:shutdownRequest");
            t.setShudownRequested();
            System.out.println("main: join");
            t.join();
        } catch (InterruptedException e) {
            System.out.println("here");
            e.printStackTrace();
        }
        System.out.println("main: END");
    }
}
