package assertions;

import org.hamcrest.core.CombinableMatcher;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by weizwang on 2015/8/6.
 */
public class AssertTest {
    @Test
    public void testAssertArrayEquals() {
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
        org.junit.Assert.assertArrayEquals("failure - byte arrays not same", expected, actual);
    }

    @Test
    public void testAssertEquals() {
        org.junit.Assert.assertEquals("failure - strings are not equal", "text", "text");
    }

    @Test
    public void testAssertFalse() {
        org.junit.Assert.assertFalse("failure - should be false", false);
    }

    @Test
    public void testAssertNotNull() {
        org.junit.Assert.assertNotNull("should not be null", new Object());
    }

    @Test
    public void testAssertNotSame() {
        org.junit.Assert.assertNotSame("should not be same Object", new Object(), new Object());
    }

    @Test
    public void testAssertNull() {
        org.junit.Assert.assertNull("should be null", null);
    }

    @Test
    public void testAssertSame() {
        Integer aNumber = Integer.valueOf(768);
        org.junit.Assert.assertSame("should be same", aNumber, aNumber);
    }

}