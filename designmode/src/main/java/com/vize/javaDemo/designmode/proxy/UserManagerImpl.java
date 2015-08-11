package com.vize.javaDemo.designmode.proxy;

/**
 * Created by weizwang on 2015/8/10.
 */
public class UserManagerImpl implements UserManager {
    public void addUser(String userId, String userName) {
        System.out.println("AddUser");
    }
}
