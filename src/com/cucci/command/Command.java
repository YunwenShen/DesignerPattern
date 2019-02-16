package com.cucci.command;

/**
 * 命令
 *
 * @author shenyw
 **/
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    /**
     * 执行命令
     */
    public abstract void execCommand();
}
