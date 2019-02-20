package com.cucci.flyweight;

import java.util.HashMap;

/**
 * 网站工厂
 *
 * @author shenyw
 **/
public class WebSiteFactory {

    private HashMap<String, WebSite> flyweights = new HashMap<>();


    /**
     * 存在对应的网站类型则直接获取，不存在则存入
     *
     * @param key
     * @return
     */
    public WebSite getWebSite(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebSite(key));
        }
        return flyweights.get(key);
    }

    /**
     * 获取不同类型网站个数
     *
     * @return
     */
    public int countWebSite() {
        return flyweights.size();
    }

}
