package grouping;

/**
 * Created by vizewang on 2015/8/17.
 */
public class Grouping {
    public String group(String target){
        String pattern="(\\w)(\\s+)([\\.,])";
        String result=target.replaceAll(pattern,"$1$3");
        System.out.println(result);
        return result;
    }
}
