package multithreadDesignPattern.workerThread;

/**
 * Created by weizwang on 2015/12/23.
 */
public class Main {
    public static void main(String[] args) {
        Channel channel=new Channel(5);
        channel.startWorkers();
        new ClientThread("Alice",channel).start();
        new ClientThread("Bobby",channel).start();
        new ClientThread("Chris",channel).start();

    }
}
