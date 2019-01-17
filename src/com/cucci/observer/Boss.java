package com.cucci.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者对象（Boss）
 *
 * @author shenyw
 **/
public class Boss extends Subject {

    /**
     * 观察者对象列表
     */
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void subjectNotify() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
