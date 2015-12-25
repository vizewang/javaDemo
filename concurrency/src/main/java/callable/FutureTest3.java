package callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by weizwang on 2015/12/23.
 */
public class FutureTest3 {
    public static class Task implements Callable<String>{

        public String call() throws Exception {
            Thread.sleep(100000);
            System.out.println("do task---"+Thread.currentThread().getName());
            return "call back result";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        FutureTask<String> task=new FutureTask<String>(new Task());
        try {
           new Thread(task).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
