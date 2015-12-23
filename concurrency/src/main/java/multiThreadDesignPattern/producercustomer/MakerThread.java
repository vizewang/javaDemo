package multithreadDesignPattern.producercustomer;

import java.util.Random;

/**
 * Created by weizwang on 2015/12/22.
 */
public class MakerThread extends Thread {
    private final Random random;
    private final Table table;
    private static int id = 0;

    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    public void run() {

        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                String take="[Cake no."+nextId()+"by "+getName()+"";
                table.put(take);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    private static synchronized int nextId() {
        return id++;
    }
}
