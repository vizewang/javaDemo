package reusing;

/**
 * Created by weizwang on 2015/7/30.
 */
class Art{
    public Art(){
        System.out.println("Art");
    }
    public Art(String string){
        System.out.println("Art "+string);
    }
}
class Drawing extends Art{
  public   Drawing(){
      super("run");
        System.out.println("Drawing");
    }
}
public class Cartoon extends Drawing {
    public Cartoon(){
        System.out.println("Cartoon");
    }

    public static void main(String[] args) {
        Cartoon cartoon=new Cartoon();
    }
}
