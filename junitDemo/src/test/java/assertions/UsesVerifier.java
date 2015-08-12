package assertions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.experimental.results.PrintableResult.testResult;
import static org.junit.experimental.results.ResultMatchers.isSuccessful;

/**
 * Created by weizwang on 2015/8/12.
 */
public class UsesVerifier {
    private static String sequence;

    public static class UsesVerifier1 {
        @Rule
        public Verifier collector = new Verifier() {
            @Override
            protected void verify() {
                sequence += "verify ";
            }
        };

        @Test
        public void example() {
            sequence += "test ";
        }

        @Test
        public void verifierRunsAfterTest() {
            sequence = "";
            assertThat(testResult(UsesVerifier1.class), isSuccessful());
            assertEquals("test verify ", sequence);
        }

    }
}
