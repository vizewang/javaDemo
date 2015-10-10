package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by weizwang on 2015/8/10.
 */
public class MyClass1 {
    public int count;
    public MyClass1(int start){
        count=start;
    }
    public void increase(int step){
        count+=step;
    }

    public static void main(String[] args) {
        MyClass1 myClass=new MyClass1(0);
        myClass.increase(2);
        System.out.println("Normal->" + myClass.count);
        try {
            Constructor constructor= MyClass1.class.getConstructor(int.class);
            MyClass1 myClassReflect= (MyClass1) constructor.newInstance(10);
            Method method= MyClass1.class.getMethod("increase", int.class);
            method.invoke(myClassReflect,5);
            Field field= MyClass1.class.getField("count");
            System.out.println("Reflect->"+field.getInt(myClassReflect));
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
