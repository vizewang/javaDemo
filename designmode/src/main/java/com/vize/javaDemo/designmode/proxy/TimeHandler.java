package com.vize.javaDemo.designmode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by vizewang on 2015/8/4.
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("汽车开始行驶...");
        method.invoke(target);
        System.out.println("汽车行驶结束...");
        return null;
    }
}
