package multithreadDesignPattern.threadPerMessage;

/**
 * Created by weizwang on 2015/12/23.
 */
public class Host {
    private final Helper helper=new Helper();
    public void request(final int count,final char c){
        System.out.println(" request("+count+", "+c+") BEGIN");
        new Thread(){
            public void run(){
                helper.handle(count,c);
            }
        }.start();
        System.out.println(" request("+count+", "+c+") END");
    }
}
