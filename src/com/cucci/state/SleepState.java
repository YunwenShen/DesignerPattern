package com.cucci.state;

/**
 * 睡眠状态（困得不行了）
 *
 * @author shenyw
 **/
public class SleepState extends State {
    @Override
    public void coding(Work work) {
        System.out.println(String.format("当前时间：%s点不行了，睡着了", work.getHour()));
    }
}
