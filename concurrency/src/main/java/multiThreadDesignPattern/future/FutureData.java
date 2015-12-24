package multiThreadDesignPattern.future;


/**
 * Created by vize on 2015/12/23.
 */
public class FutureData implements Data {
    private RealData realData=null;
    private boolean ready=false;
    public synchronized void setRealData(RealData realData){
        if(ready){
            return;
        }
        this.realData=realData;
        this.ready=true;
        notifyAll();
    }
    public synchronized String getContent() {
        while (!ready){
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.getContent();
    }
}
