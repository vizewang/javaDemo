package exception;

/**
 * Created by weizwang on 2016/1/8.
 */
public class FinallyTest {
    public static int test(){
        int i=0;
        try {
            i++;
            return i;
        }finally {
            i++;
            System.out.println("finally i is "+i);
        }
    }

    public static void main(String[] args) {
        System.out.println("returned i is "+test());
    }
}
