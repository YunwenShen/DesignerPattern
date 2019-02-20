package com.cucci.mediator;

/**
 * 美国（国家类的具体实现）
 *
 * @author shenyw
 **/
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    /**
     * 声明
     *
     * @param message
     */
    public void declare(String message) {
        mediator.declare(message, this);
    }

    /**
     * 获得消息
     *
     * @param message
     */
    public void getMessage(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
