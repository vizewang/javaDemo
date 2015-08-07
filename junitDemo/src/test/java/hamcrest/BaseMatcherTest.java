package hamcrest;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class BaseMatcherTest {

    @Test
    public void
    describesItselfWithToStringMethod() {
        Matcher<Object> someMatcher = new BaseMatcher<Object>() {
            public boolean matches(Object item) {
                throw new UnsupportedOperationException();
            }

            public void describeTo(Description description) {
                description.appendText("SOME DESCRIPTION");
            }
        };

        assertEquals("SOME DESCRIPTION", someMatcher.toString());
    }
}
