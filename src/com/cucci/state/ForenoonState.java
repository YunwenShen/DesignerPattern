package com.cucci.state;

/**
 * 上午工作状态
 *
 * @author shenyw@citycloud.com.cn
 **/
public class ForenoonState extends State {
    @Override
    public void coding(Work work) {
        if (work.getHour() < 12) {
            System.out.println(String.format("当前时间：%s 点 上午工作， 精神百倍", work.getHour()));
        } else {
            work.setState(new NoonState());
            work.coding();
        }
    }
}
