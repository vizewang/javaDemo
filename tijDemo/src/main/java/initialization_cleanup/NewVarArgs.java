package initialization_cleanup;

import java.util.DoubleSummaryStatistics;

/**
 * Created by weizwang on 2015/7/23.
 */
public class NewVarArgs {
    static void printArray(Object... args){
        for(Object o:args)
            System.out.println(o+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer(47),new Float(3.14),new NewVarArgs());
    }
}
