package com.cucci.state;

/**
 * 中午工作状态
 *
 * @author shenyw
 **/
public class NoonState extends State {

    @Override
    public void coding(Work work) {
        if (work.getHour() < 13) {
            System.out.println(String.format("当前时间：%s点 饿了，午饭：犯困，午休", work.getHour()));
        } else {
            work.setState(new AfternoonState());
            work.coding();
        }
    }
}
