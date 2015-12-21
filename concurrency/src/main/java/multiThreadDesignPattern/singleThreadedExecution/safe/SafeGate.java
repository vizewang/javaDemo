package multiThreadDesignPattern.singleThreadedExecution.safe;

/**
 * Created by vize on 2015/12/20.
 */
public class SafeGate {
    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public synchronized void pass(String name, String address) {
        this.counter++;
        this.name = name;
        this.address = address;
        check();
    }

    public  String toString() {
        return "No." + counter + ":" + name + ", " + address;
    }

    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
            System.out.println("*****BROKEN*****" + toString());
        }
    }
}
