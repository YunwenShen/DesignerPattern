package com.cucci.observer;

/**
 * 被观察者接口/通知者接口
 *
 * @author shenyw
 **/
public abstract class Subject {

    protected String subjectState;

    /**
     * 添加观察者
     *
     * @param observer
     */
    abstract void attach(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    abstract void detach(Observer observer);

    /**
     * 通知观察者
     */
    abstract void subjectNotify();

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
