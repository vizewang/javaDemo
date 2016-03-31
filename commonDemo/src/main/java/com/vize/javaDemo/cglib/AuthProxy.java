package com.vize.javaDemo.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by weizwang on 2016/3/31.
 */
public class AuthProxy implements MethodInterceptor {
    private String name;
    public AuthProxy(String name){
        this.name=name;
    }
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       if(!"lisi".equals(name)){
           System.out.println("you have no right access");
           return null;
       }
        return methodProxy.invokeSuper(o,objects);
    }
}
