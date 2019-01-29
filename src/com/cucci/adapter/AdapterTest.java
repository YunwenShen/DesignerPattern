package com.cucci.adapter;

/**
 * 适配器模式测试
 *
 * @author shenyw
 **/
public class AdapterTest {

    public static void main(String[] args) {
        // 适配器模式的使用实属无奈之举，通常是在软件开发后期或者维护阶段才使用
        // 切勿在软件开发初期使用适配器模式，这样是本末倒置
        Adapter adapter = new Adapter();
        adapter.request();
    }
}
