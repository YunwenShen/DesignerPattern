package com.cucci.mediator;

/**
 * 伊拉克（国家类的具体实现）
 *
 * @author shenyw@citycloud.com.cn
 **/
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    public void getMessage(String message) {
        System.out.println("伊拉克获得对方的信息：" + message);
    }
}
