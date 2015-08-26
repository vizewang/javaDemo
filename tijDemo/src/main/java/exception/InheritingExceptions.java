package exception;

/**
 * Created by weizwang on 2015/8/25.
 */
class SimpleException extends Exception{}
public class InheritingExceptions {
    public void f() throws SimpleException {
        System.out.println("Throw SimpleException from f()");
        throw new SimpleException();
    }

    public static void main(String[] args) {
        InheritingExceptions sed=new InheritingExceptions();
        try{
            sed.f();
        }catch (SimpleException e){
            System.out.println("get it");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
