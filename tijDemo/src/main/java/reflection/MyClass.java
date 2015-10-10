package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by weizwang on 2015/10/10.
 */
public class MyClass {
    public int count;
    public MyClass(int start) {
        count = start;
    }
    public void increase(int step) {
        count = count + step;
    }

    public static void main(String[] args) {
        try {
            Constructor constructor=MyClass.class.getConstructor(int.class);
            MyClass myClass= (MyClass) constructor.newInstance(10);
            Method method=MyClass.class.getMethod("increase", int.class);
            method.invoke(myClass, 5);
            Field field=MyClass.class.getField("count");
            System.out.println( field.getName());
            System.out.println(field.getType());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
