package com.cucci.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员类
 *
 * @author shenyw
 **/
public class Waiter {

    private List<Command> orders = new ArrayList<>();

    private int mutton = 100;

    private int chickenWing = 100;


    /**
     * 设置订单
     *
     * @param command
     */
    public void setOrders(Command command) {

        if (command instanceof BakeChickenWingCommand && chickenWing <= 0) {
            System.out.println("waiter: 鸡翅没有了!");
        } else if (command instanceof BakeMuttonCommand && mutton <= 0) {
            System.out.println("waiter: 羊肉没有了!");
        } else {
            orders.add(command);
            System.out.println("增加了订单" + new Date());
        }

    }

    /**
     * 取消订单
     *
     * @param command
     */
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单");
    }

    /**
     * 通知烤肉者
     */
    public void inform() {
        for (Command command : orders) {
            command.execCommand();
        }
    }
}
