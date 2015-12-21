package forkandjoin;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import threadPool.SingleThreadExecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

/**
 * Created by vize on 2015/12/20.
 */
public class CountTask extends RecursiveTask<Integer> {
private static final int THRESHOLD=1000;
    private int start;
    private int end;
    public CountTask(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    protected Integer compute() {
        int sum=0;
        boolean canCompute=(end-start)<=THRESHOLD;
        if(canCompute){
            for(int i=start;i<=end;i++){
                sum+=i;
            }
        }else {
            int middle=(start+end)/2;
            CountTask leftTask=new CountTask(start,middle);
            CountTask rightTask=new CountTask(middle+1,end);
            leftTask.fork();
            rightTask.fork();
            int leftResult=leftTask.join();
            int rightResult=rightTask.join();
            sum=leftResult+rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        int end=40000;
        CountTask task=new CountTask(1,end);
        Future<Integer> result=forkJoinPool.submit(task);
        Long start=System.currentTimeMillis();
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()-start);
        start=System.currentTimeMillis();
        int sum=0;
        for(int i=1;i<=end;i++){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-start);
    }
}
