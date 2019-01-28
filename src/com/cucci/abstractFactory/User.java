package com.cucci.abstractFactory;

/**
 * 用户表
 *
 * @author shenyw
 **/
public class User {

    /**
     * 用户id
     */
    private int id;

    /**
     * 用户名称
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
