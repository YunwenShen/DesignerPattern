package com.cucci.visitor;

/**
 * 人
 *
 * @author shenyw
 **/
public abstract class Person {

    public abstract void accept(Action visitor);
}

