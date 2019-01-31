package com.cucci.singleton;

/**
 * 单例测试
 *
 * @author shenyw
 **/
public class SingletonTest {

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(10);
                Singleton singleton = Singleton.getInstance();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread-1").start();

        new Thread(() -> {
            Singleton singleton = Singleton.getInstance();
        }, "thread-2").start();
    }
}
