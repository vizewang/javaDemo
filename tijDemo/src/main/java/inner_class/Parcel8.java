package inner_class;

/**
 * Created by weizwang on 2015/8/12.
 */
public class Parcel8 {
    public Wrapping wrapping(int x){
        return new Wrapping(x,x){
            public int value(){
                return super.value();
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p=new Parcel8();
        Wrapping w=p.wrapping(10);
        System.out.println(w.value());
    }
}
