package assertions;

import org.junit.Rule;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by weizwang on 2015/8/12.
 */
public class MyLoggerTest {

    @Rule
    public TestLogger logger = new TestLogger();

    @Test
    public void checkOutMyLogger() {
        final Logger log = logger.getLogger();
        log.log(Level.WARNING,"Your test is showing!");
    }

}