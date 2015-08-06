package assertions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.xml.ws.Response;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2015/8/6.
 */
public class TestException {
    @Test(expected = IndexOutOfBoundsException.class)
    public void empty() {
        new ArrayList<Object>().get(0);
    }

//    @Rule
//    public ExpectedException thrown = ExpectedException.none();
//
//    @Test
//    public void shouldTestExceptionMessage() throws IndexOutOfBoundsException {
//        List<Object> list = new ArrayList<Object>();
//
//        thrown.expect(IndexOutOfBoundsException.class);
//        thrown.expectMessage("Index: 0, Size: 0");
//        list.get(0); // execution will never get past this line
//    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrow() {
        TestThing testThing = new TestThing();
        thrown.expect(NotFoundException.class);
        thrown.expectMessage(startsWith("some Message"));
        thrown.expect(hasProperty("response", hasProperty("status", is(404))));
        testThing.chuck();
    }

    private class TestThing {
        public void chuck() {
            Response response = Response.status(Status.NOT_FOUND).entity("Resource not found").build();
            throw new NotFoundException("some Message", response);
        }
    }

}
