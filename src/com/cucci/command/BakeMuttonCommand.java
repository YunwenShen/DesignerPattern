package com.cucci.command;

/**
 * 烤羊肉串命令
 *
 * @author shenyw
 **/
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void execCommand() {
        barbecuer.bakeMutton();
    }
}
