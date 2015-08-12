package assertions;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.omg.CORBA.PRIVATE_MEMBER;

import java.util.logging.Logger;

/**
 * Created by weizwang on 2015/8/12.
 */
public class TestLogger implements TestRule {
    private Logger logger;
    public Logger getLogger(){
        return this.logger;
    }
    public Statement apply(final  Statement statement,final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                logger=Logger.getLogger(description.getTestClass().getName()+"."+description.getDisplayName());
                try {
                    statement.evaluate();
                }finally {
                    logger=null;
                }
            }
        };
    }
}
