package multithreadDesignPattern.immutable;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Created by weizwang on 2015/12/21.
 */
public class PrintPersonThread extends Thread {
    private Person person;
    public PrintPersonThread(Person person){
        this.person=person;
    }
    public void run(){
        while (true){
            System.out.println(Thread.currentThread().getName()+" prints "+person);
        }
    }
}
