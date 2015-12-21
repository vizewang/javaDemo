package multithreadDesignPattern.immutable;

/**
 * Created by weizwang on 2015/12/21.
 */
public class Main {
    public static void main(String[] args) {
        Person alice=new Person("Alice","Alaska");
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
        new PrintPersonThread(alice).start();
    }
}
