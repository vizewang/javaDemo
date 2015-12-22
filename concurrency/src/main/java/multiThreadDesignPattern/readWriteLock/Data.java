package multiThreadDesignPattern.readWriteLock;

import java.util.concurrent.locks.Lock;

/**
 * Created by vize on 2015/12/22.
 */
public class Data {
    private final char[]buffer;
    private final ReadWriteLock lock=new ReadWriteLock();
    public Data(int size){
        this.buffer=new char[size];
        for(int i=0;i<buffer.length;i++){
            buffer[i]='*';
        }
    }
    public char[]read() throws InterruptedException {
        lock.readLock();
        try {
            return doRead();
        }finally {
            lock.readUnlock();
        }
    }

    public void write(char c){
        lock.writeLock();
        try {
            doWrite(c);
        }finally {
            lock.writeUnlock();
        }
    }

    private void doWrite(char c) {
        for(int i=0;i<buffer.length;i++){
            buffer[i]=c;
            slowly();
        }
    }

    private char[] doRead() {
        char[]newbuf=new char[buffer.length];
        for(int i=0;i<buffer.length;i++){
            newbuf[i]=buffer[i];
        }
        slowly();
        return newbuf;
    }

    private void slowly() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
