package multithreadDesignPattern.guardedSuspension;

import java.util.LinkedList;

/**
 * Created by weizwang on 2015/12/21.
 */
public class RequestQueue {
    private final LinkedList queue=new LinkedList();
    public synchronized Request getRequest(){
        while (queue.size()<=0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return (Request) queue.removeFirst();
    }
    public synchronized void putRequest(Request request){
        queue.addLast(request);
        notifyAll();
    }
}
