package ThreadException;

/**
 * Created by weizwang on 2015/9/22.
 */
public class TestRuntimeException {
    public static void main(String[] args) {
        try{
            throw new NullPointerException("Bang");
        }catch (Exception e){
            System.out.println("I caught: " + e);
        }
    }
}
