package multiThreadDesignPattern.balking;

/**
 * Created by vize on 2015/12/21.
 */
public class Main {
    public static void main(String[] args) {
        Data data=new Data("data.txt","(empty)");
        new ChangerThread("ChangerThread",data).start();
        new SaverThread("SaverThread",data).start();
    }
}
