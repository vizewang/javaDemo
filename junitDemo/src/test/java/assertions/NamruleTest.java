package assertions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by weizwang on 2015/8/12.
 */
public class NamruleTest {
    @Rule
    public TestName name=new TestName();
    @Test
    public void testA() {
        assertEquals("testA", name.getMethodName());
    }

    @Test
    public void testB() {
        assertEquals("testB", name.getMethodName());
    }

}
