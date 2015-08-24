package holding;


import org.junit.Test;

import java.util.Iterator;

/**
 * Created by weizwang on 2015/8/21.
 */
public class NonCollectionSequenceTest {

    @Test
    public void testIterator() throws Exception {
NonCollectionSequence nc=new NonCollectionSequence();
        Iterator it=nc.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}