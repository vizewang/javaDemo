package base;

/**
 * Created by vize on 2015/12/20.
 */
public class Printer implements Runnable {
    private String message;
    public Printer(String message){
        this.message=message;
    }
    public void run() {
       for(int i=0;i<10000;i++){
           System.out.println(Thread.currentThread().getName()+":"+message);
       }
    }

    public static void main(String[] args) {
        new Thread(new Printer("good!")).start();
        new Thread(new Printer("nice!")).start();
    }
}
