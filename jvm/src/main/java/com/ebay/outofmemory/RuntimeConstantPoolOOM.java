package com.ebay.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2016/3/31.
 */
public class RuntimeConstantPoolOOM {
    public static void f(){
        List<String> list=new ArrayList<String>();
        int i=0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
