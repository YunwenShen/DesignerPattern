package com.cucci.flyweight;

/**
 * 享元模式测试类
 *
 * @author shenyw
 **/
public class FlyweightTest {

    public static void main(String[] args) {
        WebSiteFactory factory = new WebSiteFactory();

        WebSite webSite1 = factory.getWebSite("产品展示");
        webSite1.use();

        WebSite webSite2 = factory.getWebSite("产品展示");
        webSite2.use();

        WebSite webSite3 = factory.getWebSite("产品展示");
        webSite3.use();

        WebSite website4 = factory.getWebSite("博客");
        website4.use();

        WebSite website5 = factory.getWebSite("博客");
        website5.use();

        WebSite website6 = factory.getWebSite("博客");
        website6.use();

        System.out.println(factory.countWebSite());

        // 享元模式-实际例子就是 缓存
    }
}
