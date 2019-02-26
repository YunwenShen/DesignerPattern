package com.cucci.visitor;

/**
 * @author shenyw
 **/
public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
