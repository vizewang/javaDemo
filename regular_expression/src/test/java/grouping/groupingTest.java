package grouping;

import static org.junit.Assert.*;

/**
 * Created by vizewang on 2015/8/17.
 */
public class GroupingTest {

    @org.junit.Test
    public void testGroup() throws Exception {
        Grouping grouping = new Grouping();
        assertEquals("adsjfposud.", grouping.group("adsj fp os ud ."));
    }
}