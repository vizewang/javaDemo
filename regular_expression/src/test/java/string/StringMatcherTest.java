package string;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vizewang on 2015/8/17.
 */
public class StringMatcherTest {
    private StringMatcher m;

    @Before
    public void setUp() throws Exception {
        m = new StringMatcher();
    }

    @Test
    public void testIsTrue() throws Exception {
        assertTrue(m.isTrue("true"));
        assertFalse(m.isTrue("true2"));
        assertFalse(m.isTrue("True"));
    }

    @Test
    public void testIsTrueVersion2() throws Exception {
        assertTrue(m.isTrueVersion2("true"));
        assertFalse(m.isTrueVersion2("true2"));
        assertTrue(m.isTrueVersion2("True"));;
    }

    @Test
    public void testIsTrueOrYes() throws Exception {
        assertTrue(m.isTrueOrYes("true"));
        assertTrue(m.isTrueOrYes("yes"));
        assertTrue(m.isTrueOrYes("Yes"));
        assertFalse(m.isTrueOrYes("no"));
    }

    @Test
    public void testContainsTrue() throws Exception {
        assertTrue(m.containsTrue("thetruewithin"));
    }

    @Test
    public void testIsThreeLetters() throws Exception {
        assertTrue(m.isThreeLetters("abc"));
        assertFalse(m.isThreeLetters("abcd"));
    }

    @Test
    public void testIsNoNumberAtBeginning() throws Exception {
        assertTrue(m.isNoNumberAtBeginning("abc"));
        assertFalse(m.isNoNumberAtBeginning("1abcd"));
        assertTrue(m.isNoNumberAtBeginning("a1bcd"));
        assertTrue(m.isNoNumberAtBeginning("asdfdsf"));
    }

    @Test
    public void testIsIntersection() throws Exception {
        assertTrue(m.isIntersection("1"));
        assertFalse(m.isIntersection("abcksdfkdskfsdfdsf"));
        assertTrue(m.isIntersection("skdskfjsmcnxmvjwque484242"));
    }

    @Test
    public void testIsLessThenThreeHundred() throws Exception {
        assertTrue(m.isLessThenThreeHundred("288"));
        assertFalse(m.isLessThenThreeHundred("3288"));
        assertFalse(m.isLessThenThreeHundred("328 8"));
        assertTrue(m.isLessThenThreeHundred("1"));
        assertTrue(m.isLessThenThreeHundred("99"));
        assertFalse(m.isLessThenThreeHundred("300"));
    }
}