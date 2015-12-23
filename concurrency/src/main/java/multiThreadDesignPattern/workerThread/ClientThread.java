package multithreadDesignPattern.workerThread;


import java.util.Random;

/**
 * Created by weizwang on 2015/12/22.
 */
public class ClientThread extends Thread {
    private final Channel channel;
private static final Random random=new Random();
    public ClientThread(String name,Channel channel){
        super(name);
        this.channel=channel;
    }
    public void run(){
        for(int i=0;true;i++){
            Request request=new Request(getName(),i);
            channel.putRequest(request);
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
