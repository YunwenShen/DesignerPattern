package com.cucci.flyweight;

/**
 * 具体网站类
 *
 * @author shenyw
 **/
public class ConcreteWebSite extends WebSite {

    /**
     * 网站名称
     */
    private String name;

    public ConcreteWebSite(String name) {
        this.name = name;
    }

    @Override
    public void use() {
        System.out.println("网站分类：" + name);
    }
}
