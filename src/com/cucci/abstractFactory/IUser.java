package com.cucci.abstractFactory;

/**
 * user类的操作接口
 *
 * @author shenyw
 **/
public interface IUser {

    /**
     * 新增用户
     *
     * @param user
     */
    void addUser(User user);

    /**
     * 根据用户id，获取用户实体
     *
     * @param id
     * @return
     */
    User getUser(int id);

}
