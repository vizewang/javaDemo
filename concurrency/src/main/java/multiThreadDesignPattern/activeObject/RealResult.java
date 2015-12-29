package multiThreadDesignPattern.activeObject;

import java.util.Objects;

/**
 * Created by vize on 2015/12/26.
 */
public class RealResult  extends Result{
private final Object resultValue;
    public RealResult(Object resultValue){
        this.resultValue=resultValue;
    }
    @Override
    public Object getResultValue() {
        return resultValue;
    }
}
