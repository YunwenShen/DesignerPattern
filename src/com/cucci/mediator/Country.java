package com.cucci.mediator;

/**
 * 非中介者（国家类）
 *
 * @author shenyw
 **/
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
