package multithreadDesignPattern.guardedSuspension;

/**
 * Created by weizwang on 2015/12/21.
 */
public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue=new RequestQueue();
        new ClientThread(requestQueue,"Alice",3141592l).start();
        new ServerThread(requestQueue,"Bobby",6535897l).start();
    }
}
