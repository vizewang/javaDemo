package multithreadDesignPattern.immutable;

/**
 * Created by weizwang on 2015/12/21.
 */
public class Person {
    private final String name;
    private final String address;
    public Person(String name,String address){
        this.name=name;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String toString(){
        return "[Person:name="+name+",address= "+address+"]";
    }
}
