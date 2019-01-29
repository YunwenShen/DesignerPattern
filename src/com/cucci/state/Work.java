package com.cucci.state;

/**
 * 工作类
 *
 * @author shenyw
 **/
public class Work {

    /**
     * 状态
     */
    private State state;

    /**
     * 时间
     */
    private double hour;

    /**
     * 工作是否已经完成
     */
    private boolean finish;

    public Work() {
        this.state = new ForenoonState();
    }

    public void coding() {
        state.coding(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
