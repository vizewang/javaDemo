package multiThreadDesignPattern.activeObject;

/**
 * Created by vize on 2015/12/26.
 */
public class DisplayStringRequest extends MethodRequest {
    private final String string;
    public DisplayStringRequest(Servant servant,String string){
        super(servant,null);
        this.string=string;
    }
    @Override
    public void execute() {
        servant.displayString(string);
    }
}
