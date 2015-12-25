package com.vize.javaDemo.observer;

/**
 * Created by vizewang on 2015/8/16.
 */
public class ConcreteObserver implements Observer {
    private String observerState;
    public void update(Subject subject) {
        observerState=((ConcreteSubject)subject).getSubjectState();

    }
}
