package multiThreadDesignPattern.activeObject;

/**
 * Created by vize on 2015/12/26.
 */
public class Servant  implements ActiveObject{
    public Result makeString(int count, char fillchar) {
        char[] buffer=new char[count];
        for(int i=0;i<count;i++){
            buffer[i]=fillchar;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new RealResult(new String(buffer));
    }

    public void displayString(String string) {
        System.out.println("displayString: "+string);
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
