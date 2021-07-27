package com.cucci.proxy;

/**
 * 卖方中介
 *
 * @author shenyw
 **/
public class Proxy implements BuyHouse {

    private Customer customer;

    public Proxy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buy() {
        System.out.println("客户你好，请你付钱");
        customer.buy();
        System.out.println("买房成功，这是你的房产证");
    }
}
