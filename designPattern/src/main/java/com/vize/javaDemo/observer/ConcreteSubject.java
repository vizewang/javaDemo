package com.vize.javaDemo.observer;

/**
 * Created by vizewang on 2015/8/16.
 */
public class ConcreteSubject extends Subject {
private String subjectState;
    public String getSubjectState(){
        return subjectState;
    }
    public void setSubjectState(String subjectState){
        this.subjectState=subjectState;
        this.notifyObservers();
    }
}
