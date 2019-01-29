package com.cucci.state;

/**
 * 晚间工作状态
 *
 * @author shenyw
 **/
public class EveningState extends State {
    @Override
    public void coding(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.coding();
        } else {
            if (work.getHour() < 21) {
                System.out.println(String.format("当前时间: %s点 加班哦，疲惫之极", work.getHour()));
            } else {
                work.setState(new SleepState());
                work.coding();
            }
        }
    }
}
