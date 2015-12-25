package com.vize.javaDemo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vizewang on 2015/8/16.
 */
public class Subject {
    private List<Observer> observers=new ArrayList<Observer>();
    public void attch(Observer observer){
        observers.add(observer);
    }
    public void detach(Observer observer){
        observers.remove(observer);
    }


    protected void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}
