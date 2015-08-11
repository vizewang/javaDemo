package com.vize.javaDemo.designmode.proxy;

/**
 * Created by vizewang on 2015/7/24.
 */
public class Client {
    public static void main(String[] args) {
//        Car car=new Car();
//        car.move();
//       Car car=new Car();
//      CarTimeProxy carTimeProxy=new CarTimeProxy(car);
//        CarLogProxy carLogProxy=new CarLogProxy(carTimeProxy);
//              carLogProxy.move();
        LogHandler logHandler=new LogHandler();
        UserManager userManager= (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
     userManager.addUser("000","уехЩ");
    }
}
