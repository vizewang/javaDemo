package multithreadDesignPattern.workerThread;

/**
 * Created by weizwang on 2015/12/22.
 */
public class WorkerThread extends Thread{
    private final Channel channel;
    public WorkerThread(String name,Channel channel){
        super(name);
        this.channel=channel;
    }
    public void run(){
        while (true){
            Request request=channel.takeRequest();
            request.execute();
        }
    }
}
