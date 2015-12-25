package com.vize.javaDemo.templatepattern;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by vizewang on 2015/8/15.
 */
public class RefreshBeverageTest {

    @Test
    public void testPrepareBeverageTemplate() throws Exception {
        System.out.println("制备咖啡....");
        RefreshBeverage beverage=new Coffee();
        beverage.prepareBeverageTemplate();
        System.out.println("咖啡好了");
        System.out.println("制备茶...");
        RefreshBeverage beverage2=new Tea();
        beverage2.prepareBeverageTemplate();
        System.out.println("茶好了");
    }
}