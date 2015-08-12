package assertions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.StringStartsWith.startsWith;

/**
 * Created by weizwang on 2015/8/12.
 */
public class HasExpectedException {
    @Rule
    public ExpectedException thrown= ExpectedException.none();

    @Test
    public void throwsNothing() {

    }

    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    public void throwsNullPointerExceptionWithMessage() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("happened?");
        thrown.expectMessage(startsWith("What"));
        throw new NullPointerException("What happened?");
    }
}
