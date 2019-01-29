package com.cucci.state;

/**
 * 休息状态
 *
 * @author shenyw
 **/
public class RestState extends State {
    @Override
    public void coding(Work work) {
        System.out.println(String.format("当前时间：%s点下班回家了", work.getHour()));
    }
}
