package com.ebay.outofmemory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weizwang on 2016/3/30.
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        List<OOMObject> list=new ArrayList<OOMObject>();
        while (true){
            list.add(new OOMObject());
        }
    }
}
