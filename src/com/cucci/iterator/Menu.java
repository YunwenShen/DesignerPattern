package com.cucci.iterator;

/**
 * 菜单接口
 *
 * @author shenyw
 **/
public interface Menu {

    /**
     * 添加元素
     *
     * @param channel
     * @param name
     * @param description
     */
    void addItem(int channel, String name, String description);

    /**
     * 生成迭代器
     *
     * @return
     */
    Iterator createIterator();

}
