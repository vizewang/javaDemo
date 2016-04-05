package com.ebay.outofmemory.main;

import com.ebay.outofmemory.FinalizeEscapeGC;
import com.ebay.outofmemory.ReferenceCountingGC;

/**
 * Created by weizwang on 2016/3/31.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        save();
    }
    public static void save() throws InterruptedException {
        FinalizeEscapeGC.SAVE_HOOK=new FinalizeEscapeGC();
        FinalizeEscapeGC.SAVE_HOOK=null;
        System.gc();
        Thread.sleep(500);
        if(FinalizeEscapeGC.SAVE_HOOK!=null){
            FinalizeEscapeGC.SAVE_HOOK.isAlive();
        }else {
            System.out.println("no, i am dead:(");
        }

        FinalizeEscapeGC.SAVE_HOOK=null;
        System.gc();
        Thread.sleep(500);
        if(FinalizeEscapeGC.SAVE_HOOK!=null){
            FinalizeEscapeGC.SAVE_HOOK.isAlive();
        }else {
            System.out.println("no, i am dead:(");
        }
    }
}
