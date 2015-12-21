package multithreadDesignPattern.guardedSuspension;

/**
 * Created by weizwang on 2015/12/21.
 */
public class Request {
    private final String name;
    public Request(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "[Request" + name +  ']';
    }
}
