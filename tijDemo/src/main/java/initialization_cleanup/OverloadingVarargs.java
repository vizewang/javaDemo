package initialization_cleanup;

/**
 * Created by weizwang on 2015/7/23.
 */
public class OverloadingVarargs {
    static void f(Character... args){
        System.out.println("first");
    }
    static void f(Integer... args){
        System.out.println("second");
    }

    public static void main(String[] args) {
        f('c');
    }
}
