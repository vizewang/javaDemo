package multiThreadDesignPattern.balking.timeOut;

/**
 * Created by vize on 2015/12/21.
 */
public class TimeoutException extends InterruptedException{
    public TimeoutException(String msg){
        super(msg);
    }
}
