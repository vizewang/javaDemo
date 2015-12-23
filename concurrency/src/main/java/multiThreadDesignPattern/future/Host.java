package multiThreadDesignPattern.future;

/**
 * Created by vize on 2015/12/23.
 */
public class Host {
    public Data request(final int count,final char c){
        System.out.println(" request("+count+", "+c+") BEGIN");
        final FutureData futureData=new FutureData();
        new Thread(){
            public void run(){
                RealData realData=new RealData(count,c);
                futureData.setRealData(realData);
            }
        }.start();
        System.out.println(" request("+count+", "+c+") END");
        return futureData;
    }
}
