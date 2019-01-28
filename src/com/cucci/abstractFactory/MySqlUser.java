package com.cucci.abstractFactory;

/**
 * @author shenyw
 **/
public class MySqlUser implements IUser {
    @Override
    public void addUser(User user) {
        System.out.println("在 MySQL 中添加了一个用户");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 MySQL 中读取了一个用户");
        return null;
    }
}
