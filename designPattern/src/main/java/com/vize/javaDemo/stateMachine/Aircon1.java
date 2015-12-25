package com.vize.javaDemo.stateMachine;

/**
 * Created by weizwang on 2015/12/25.
 */
public class Aircon1 {
    State state=State.OFF;
    public void power(){
        state.power(this);
    }
    public void cool(){
        state.cool(this);
    }

    public static void main(String[] args) {
        Aircon1 ac=new Aircon1();
        System.out.println("Current State:"+ac.state.name());
        ac.cool();
        ac.power();
        ac.cool();
        ac.cool();
        ac.power();
        ac.power();
        ac.power();
    }
}
