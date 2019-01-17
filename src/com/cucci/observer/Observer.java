package com.cucci.observer;

/**
 * 观察者对象/消息接收者
 *
 * @author shenyw
 **/
public abstract class Observer {

    /**
     * 观察者对象名称/消息接收者名称
     */
    protected String name;

    /**
     * 被观察者对象名称/消息发送者
     */
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
