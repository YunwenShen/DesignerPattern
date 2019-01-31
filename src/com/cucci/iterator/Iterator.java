package com.cucci.iterator;

/**
 * 迭代器
 *
 * @author shenyw
 **/
public interface Iterator {

    /**
     * 是否还有下一个元素
     *
     * @return
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     *
     * @return
     */
    Object next();
}
