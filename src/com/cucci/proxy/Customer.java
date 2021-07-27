package com.cucci.proxy;

/**
 * 买房的顾客
 *
 * @author shenyw
 **/
public class Customer implements BuyHouse {
    @Override
    public void buy() {
        System.out.println("我付钱了");
    }
}
