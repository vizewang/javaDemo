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
            System.out.println("do task---"+Thread.currentThread().getName());
            return "call back result";
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<String>> futures=new ArrayList<Future<String>>();
        ExecutorService es= Executors.newCachedThreadPool();
        for(int i=0;i<100;i++){
            futures.add(es.submit(new Task()));
        }
        for(Future<String>f:futures){
            System.out.println(f.get());
        }
    }
}
