package interfaces;

import java.util.Random;

/**
 * Created by weizwang on 2015/8/10.
 */
public interface RandVals {
    Random RAND=new Random(47);
    int RANDOM_INT=RAND.nextInt(10);
}
