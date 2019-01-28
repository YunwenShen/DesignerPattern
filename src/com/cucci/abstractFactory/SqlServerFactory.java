package com.cucci.abstractFactory;

/**
 * SqlServer数据库操作对象
 *
 * @author shenyw
 **/
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }
}
