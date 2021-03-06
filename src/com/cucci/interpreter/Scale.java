package com.cucci.interpreter;

/**
 * 音符类
 *
 * @author shenyw
 **/
public class Scale extends Expression {
    @Override
    public void execute(String key, double value) {
        String scale = "";
        switch ((int) value) {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                break;
        }
        System.out.println(scale);
    }

}
