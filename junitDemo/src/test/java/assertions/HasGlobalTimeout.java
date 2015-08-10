package assertions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Created by weizwang on 2015/8/7.
 */
public class HasGlobalTimeout {
    public static String log;

    @Rule
    public Timeout globalTimeout=Timeout.seconds(10);
    @Test
    public void testInfiniteLoop1(){
        log+="ran1";
        for(;;){

        }
    }

    @Test
    public void testInfiniteLoop2(){

    }
}
