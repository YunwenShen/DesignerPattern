package com.cucci.command;

/**
 * 命令模式测试类
 *
 * @author shenyw
 **/
public class CommandTest {

    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();

        Command bakeChickenWing = new BakeChickenWingCommand(boy);
        Command bakeMutton1 = new BakeMuttonCommand(boy);
        Command bakeMutton2 = new BakeMuttonCommand(boy);

        Waiter girl = new Waiter();
        girl.setOrders(bakeChickenWing);
        girl.setOrders(bakeMutton1);
        girl.setOrders(bakeMutton2);

        girl.inform();

    }
}
