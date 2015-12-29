package multiThreadDesignPattern.activeObject;


/**
 * Created by vize on 2015/12/26.
 */
public class ActiveObjectFactory {
    public static ActiveObject createActiveObject(){
        Servant servant=new Servant();
        ActivationQueue queue=new ActivationQueue();
        SchedulerThread scheduler=new SchedulerThread(queue);
        Proxy proxy=new Proxy(scheduler,servant);
        scheduler.start();
        return proxy;
    }
}
