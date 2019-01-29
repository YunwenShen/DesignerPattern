package com.cucci.adapter;

/**
 * 适配器（通过内部包装一个Adaptee对象）
 *
 * @author shenyw
 **/
public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.specialRequest();
    }
}
