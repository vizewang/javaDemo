package ibm;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

/**
 * Created by weizwang on 2015/8/12.
 */
public class RegularExpressionJunit4Test {
    private static String zipRegEx = "^\\d{5}([\\-]\\d{4})?$";
    private static Pattern pattern;

    @BeforeClass
    public static void setUpBeforeClass() {
        pattern = Pattern.compile(zipRegEx);
    }
//    @Ignore("this regular expression isn't working yet")
    @Test(expected = IndexOutOfBoundsException.class)
    public void verifyZipCodeGroupException(){
        Matcher mtcher = this.pattern.matcher("22101-5051");
        boolean isValid = mtcher.matches();
        mtcher.group(2);
    }
    @Ignore("this regular expression isn't working yet")
    @Test
    public void verifyZipCodeMatch() throws Exception{
        Pattern pattern = Pattern.compile("^\\d{5}([\\-]\\d{4})");
        Matcher mtcher = pattern.matcher("22011");
        boolean isValid = mtcher.matches();
        assertTrue("Pattern did not validate zip code", isValid);
    }

    @Test
    public void verifyArrayContents() throws Exception{
        String[] actual = new String[] {"JUnit 3.8.x", "JUnit 4", "TestNG"};
        String[] var = new String[] {"JUnit 3.8.x", "JUnit 4", "TestNG 5.5"};
        assertEquals("the two arrays should not be equal", actual, var);
    }
}