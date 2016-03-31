package com.vize.javaDemo.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by weizwang on 2016/3/31.
 */
public class TableDAOFactory {
    private static TableDAO tableDAO=new TableDAO();
    public static TableDAO getInstance(){
        return tableDAO;
    }
    public static TableDAO getAuthInstance(AuthProxy authProxy){
        Enhancer en = new Enhancer();
        en.setSuperclass(TableDAO.class);
        en.setCallback(authProxy);
        return (TableDAO)en.create();
    }
}
