package com.cucci.abstractFactory;

/**
 * 具体访问数据库的类
 *
 * @author shenyw
 **/
public class SqlServerUser implements IUser {


    @Override
    public void addUser(User user) {
        System.out.println("在 SqlServer 中添加了一个用户");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 SqlServer 中读取了一个用户");
        return null;
    }
}
