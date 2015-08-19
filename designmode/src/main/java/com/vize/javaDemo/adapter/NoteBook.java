package com.vize.javaDemo.adapter;

/**
 * Created by vizewang on 2015/8/16.
 */
public class NoteBook {
    private ThreePlugIf plugIf;
    public NoteBook(ThreePlugIf plugIf){
        this.plugIf=plugIf;
    }
    public void charge(){
        System.out.println("使用插座充电");
        plugIf.powerWithThree();
    }

    public static void main(String[] args) {
        GBTwoPlug twoPlug=new GBTwoPlug();

        ThreePlugIf plugIf=new TwoPlugAdapter(twoPlug);
        NoteBook nb=new NoteBook(plugIf);
        nb.charge();
    }
}
