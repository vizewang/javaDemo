package multiThreadDesignPattern.readWriteLock;

/**
 * Created by vize on 2015/12/22.
 */
public class Main {
    public static void main(String[] args) {
        Data data = new Data(10);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new ReaderThread(data).start();
        new WriterThread(data, "adlkjfa;jdf;adjf;sa").start();
        new WriterThread(data, "j;jk;oijopuopujop").start();
    }
}
