package com.cucci.abstractFactory;

/**
 * @author shenyw
 **/
public class MySqlFactory implements IFactory {


    @Override
    public IUser createUser() {
        return new MySqlUser();
    }
}
