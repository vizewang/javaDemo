package convert;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2015/8/24.
 */
public class Convertor {
    public static void convertToJson(){
        User user = new User();
        User user1=new User();
        List<User> list=new ArrayList<User>();
        list.add(user);
        list.add(user1);
        ObjectMapper mapper = new ObjectMapper();
        // convert user object to json string, and save to a file
        try {
            mapper.writeValue(new File("user.json"), list);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // display to console
        try {
            System.out.println(mapper.writeValueAsString(list));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void convertToObj(){
        ObjectMapper mapper=new ObjectMapper();
        File jsonFile=new File("user.json");
        try {
            List user=mapper.readValue(jsonFile,List.class);
            System.out.println(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
