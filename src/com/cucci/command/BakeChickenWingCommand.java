package com.cucci.command;

/**
 * 烤鸡翅命令
 *
 * @author shenyw
 **/
public class BakeChickenWingCommand extends Command {

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execCommand() {
        barbecuer.bakeChickenWing();
    }
}
