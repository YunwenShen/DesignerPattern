package com.cucci.visitor;

/**
 * 事件
 *
 * @author shenyw
 **/
public abstract class Action {

    /**
     * 获得男人的反应
     *
     * @param man
     */
    public abstract void getManConclusion(Man man);

    /**
     * 获得女人的反应
     *
     * @param woman
     */
    public abstract void getWomanConclusion(Woman woman);
}
