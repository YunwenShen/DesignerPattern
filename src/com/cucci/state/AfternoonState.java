package com.cucci.state;

/**
 * 下午工作状态
 *
 * @author shenyw
 **/
public class AfternoonState extends State {
    @Override
    public void coding(Work work) {
        if (work.getHour() < 17) {
            System.out.println(String.format("当前时间 %s点 下午状态还不错，继续努力", work.getHour()));
        } else {
            work.setState(new EveningState());
            work.coding();
        }
    }
}
