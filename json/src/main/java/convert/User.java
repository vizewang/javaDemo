package convert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2015/8/24.
 */
public class User {
    private int age = 29;
    private String name = "mkyong";
    private List<String> messages = new ArrayList<String>() {
        {
            add("msg 1");
            add("msg 2");
            add("msg 3");
        }
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
//getter and setter methods

//    @Override
//    public String toString() {
//        return "User [age=" + age + ", name=" + name + ", " +
//                "messages=" + messages + "]";
//    }
}
