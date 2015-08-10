package assertions;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Created by weizwang on 2015/8/6.
 */
//@FixMethodOrder(MethodSorters.DEFAULT)
public class TestMethodOrder {
    @Ignore("Test is ignored")
    @Test
    public void testA() {
        System.out.println("first");
    }

    @Test
    public void testB() {
        System.out.println("second");
    }

    @Test
    public void testC() {
        System.out.println("third");
    }
}
