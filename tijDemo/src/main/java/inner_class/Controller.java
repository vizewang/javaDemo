package inner_class;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2015/8/17.
 */
public class Controller {
    private List<Event> eventList=new ArrayList<Event>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        for(Event e:new ArrayList<Event>(eventList)){
            if(e.ready()){
                System.out.println(e);
                e.action();
                eventList.remove(e);
            }
        }

    }
}
