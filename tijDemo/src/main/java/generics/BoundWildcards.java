package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2015/10/15.
 */
public class BoundWildcards {
    static class Food{}
    static class Fruit extends Food{}
    static class Apple extends Fruit{}
    static class RedApple extends Apple{}

    public static void main(String[] args) {
        List<? extends Fruit> flist=new ArrayList<Apple>();
        flist.add(null);
        List<? super Fruit> flist2=new ArrayList<Fruit>();
        flist2.add(new Fruit());
        flist2.add(new Apple());
    }
}
