package callable;

import java.util.concurrent.*;

/**
 * Created by weizwang on 2015/12/24.
 */
public class CallableShut implements Callable<String> {

    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " start");
        FutureTask<String> futureTask = new FutureTask(new FutureTest3.Task());
        new Thread(futureTask).start();
        Thread.sleep(10000);
        return "" + Thread.currentThread().getName() + " end";
    }

    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask(new CallableShut());
        Thread task = new Thread(futureTask);
        task.start();
//        task.interrupt();
        try {
//            futureTask.cancel(true);
            String str = futureTask.get(1, TimeUnit.SECONDS);
            System.out.println(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
