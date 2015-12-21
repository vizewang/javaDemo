package multiThreadDesignPattern.singleThreadedExecution.unsafe;

import multiThreadDesignPattern.singleThreadedExecution.safe.SafeGate;

/**
 * Created by vize on 2015/12/20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Testing SafeGate, hit CTRL+C to exit.");
        Gate gate=new Gate();
        new UserThread(gate,"Alice","Alaska").start();
        new UserThread(gate,"Bobby","Brazil").start();
        new UserThread(gate,"Chris","Canada").start();
    }
}
