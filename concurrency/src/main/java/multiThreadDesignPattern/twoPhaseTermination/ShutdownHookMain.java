package multiThreadDesignPattern.twoPhaseTermination;

/**
 * Created by weizwang on 2015/12/24.
 */
public class ShutdownHookMain {
    public static void main(String[] args) {
        System.out.println("main:BEGIN");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("****************");
                System.out.println(Thread.currentThread().getName() + ": SHUTDOWN HOOK!");
                System.out.println("****************");
            }
        });
        System.out.println("main:SLEEP...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main:EXIT");
        System.exit(0);
        System.out.println("main:END");
    }
}
