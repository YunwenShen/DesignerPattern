package com.cucci.composite;

/**
 * 公司抽象类
 *
 * @author shenyw
 **/
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    /**
     * 添加节点
     *
     * @param company
     */
    public abstract void add(Company company);

    /**
     * 移除节点
     *
     * @param company
     */
    public abstract void remove(Company company);

    /**
     * 显示
     *
     * @param depth
     */
    public abstract void display(int depth);

    /**
     * 履行职责
     */
    public abstract void lineOfDuty();
}
