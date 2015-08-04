package chapter6.item31;

/**
 * Created by weizwang on 2015/7/29.
 */
public enum  Ensemble {
    DUET, SOLO,TRIO,QUARTET,QUINTET;
    public int numberOfMusicians(){
        return ordinal()+1;
    }
}
