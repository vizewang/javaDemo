package multiThreadDesignPattern.readWriteLock;


import java.util.Random;

/**
 * Created by vize on 2015/12/22.
 */
public class WriterThread extends Thread {
    private static final Random random=new Random();
    private final Data data;
    private final String filler;
    private  int index;
    public WriterThread(Data data,String filler){
        this.data=data;
        this.filler=filler;
    }
    public void run(){
        try{
            while (true){
                char c=nextchar();
                data.write(c);
                Thread.sleep(random.nextInt(3000));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private char nextchar() {
        char c=filler.charAt(index);
        index++;
        if(index>=filler.length()){
            index=0;
        }
        return c;
    }
}
