package com.cucci.abstractFactory;

/**
 * 抽象类测试类
 *
 * @author shenyw
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        User user = new User();
        // 如果需要更换数据库只需更改这一句就可以了，这也是抽象工厂带来的好处
        // 如果需要添加一个操作部门的需要添加IDepartment、MySqlDepartment、SqlServerDepartment 改动就比较大了
//         IFactory factory = new MySqlFactory();
        IFactory factory = new SqlServerFactory();
        IUser iUser = factory.createUser();
        iUser.addUser(user);

        iUser.getUser(1);

    }
}
