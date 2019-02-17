package com.cucci.chain;

/**
 * 管理者
 *
 * @author shenyw
 **/
public abstract class Manager {

    /**
     * 管理者姓名
     */
    protected String name;

    /**
     * 管理者的上级
     */
    protected Manager superior;

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void dealWithApply(Apply apply);
}
