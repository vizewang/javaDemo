package multithreadDesignPattern.threadPerMessage;

/**
 * Created by weizwang on 2015/12/23.
 */
public class Main {
    public static void main(String[] args) {
        Host host=new Host();
        host.request(10,'A');
        host.request(20,'B');
        host.request(30,'C');
    }
}
