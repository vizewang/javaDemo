package concurrentHashMap;

import java.util.HashMap;
import java.util.UUID;

/**
 * Created by vize on 2015/12/19.
 */
public class ConcurrentHashMap {
   static final HashMap<String,String> map=new HashMap<String, String>(2);
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<10000;i++){
                    new Thread(new Runnable() {
                        public void run() {
                            map.put(UUID.randomUUID().toString(),"");
                        }
                    },"ftf"+i).start();
                }

            }
        },"ftf");
        t.start();
        t.join();
    }

}
