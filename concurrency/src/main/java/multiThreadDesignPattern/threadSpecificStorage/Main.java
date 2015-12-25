package multiThreadDesignPattern.threadSpecificStorage;

/**
 * Created by weizwang on 2015/12/25.
 */
public class Main {
    public static void main(String[] args) {
        Thread task1=new ClientThread("Alice");
        task1.start();
        task1.start();
        new ClientThread("Bobby").start();
        new ClientThread("Chris").start();
    }
}
