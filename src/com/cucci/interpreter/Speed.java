package com.cucci.interpreter;

/**
 * 音速类
 *
 * @author shenyw
 **/
public class Speed extends Expression {

    @Override
    public void execute(String key, double value) {
        String speed;
        if (value < 500) {
            speed = "低速";
        } else if (value >= 1000) {
            speed = "高速";
        } else {
            speed = "中速";
        }
        System.out.println(speed);
    }
}
