package ThreadException;

/**
 * Created by weizwang on 2015/9/22.
 */
public class TestException {
    public static void main(String[] args) {
        Test test=new Test();
        test.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println(t.getName()+":"+e.getMessage());
            }
        });
        test.start();
//        try{
//            new Test().start();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }

    public static class Test extends Thread{
        public Test(){}
        public void run(){
            throw new RuntimeException("just a test");
        }
    }
}
