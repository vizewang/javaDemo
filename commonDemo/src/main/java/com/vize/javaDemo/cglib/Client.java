package com.vize.javaDemo.cglib;

/**
 * Created by weizwang on 2016/3/31.
 */
public class Client {
    public static void haveAuth(){
        TableDAO tDao = TableDAOFactory.getAuthInstance(new AuthProxy("lisi"));
        doMethod(tDao);
    }
    public static void haveNoAuth(){
        TableDAO tDao = TableDAOFactory.getAuthInstance(new AuthProxy("ÀîËÄ"));
        doMethod(tDao);
    }
    public static void main(String[] args) {
       haveAuth();
        haveNoAuth();
    }
    public static void doMethod(TableDAO dao){
        dao.create();
        dao.query();
        dao.update();
        dao.delete();
    }
}
