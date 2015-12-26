package multiThreadDesignPattern.activeObject;

/**
 * Created by vize on 2015/12/26.
 */
public class SchedulerThread extends Thread {
    private final ActivationQueue queue;

    public SchedulerThread(ActivationQueue queue) {
        this.queue = queue;
    }

    public void invoke(MethodRequest request){
        queue.putRequest(request);
    }

    public void run() {
    while (true){
        MethodRequest request=queue.takeRequest();
        request.execute();
    }
    }
}
