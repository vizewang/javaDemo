package generics;

/**
 * Created by weizwang on 2015/10/16.
 */
class Subtype extends BasicHolder<Subtype>{}
public class CRGWithBasicHolder {
    public static void main(String[] args) {
        Subtype st1=new Subtype(),st2=new Subtype();
        st1.set(st2);
        Subtype st3=st1.get();
        st1.f();
    }
}
