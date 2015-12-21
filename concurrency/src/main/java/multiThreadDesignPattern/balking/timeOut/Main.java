package multiThreadDesignPattern.balking.timeOut;

/**
 * Created by vize on 2015/12/21.
 */
public class Main {
    public static void main(String[] args) {
        Host host=new Host(10000);
        System.out.println("execute BEGIN");
        try {
            host.execute();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
