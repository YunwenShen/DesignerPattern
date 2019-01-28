package com.cucci.state;

/**
 * @author shenyw@citycloud.com.cn
 **/
public class StateTest {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.coding();

        work.setHour(10);
        work.coding();

        work.setHour(11);
        work.coding();

        work.setHour(12);
        work.coding();

        work.setHour(13);
        work.coding();

        work.setHour(14);
        work.coding();

        work.setHour(17);
        work.coding();

        work.setFinish(true);
        work.coding();

    }
}
