package com.cucci.decorator;

/**
 * @author shenyw@citycloud.com.cn
 **/
public class decoratorTest {

    public static void main(String[] args) {
        IThirdPartyService service = new ThirdPartyServiceImpl();
        ThirdPartyDecorator decorator = new ThirdPartyDecorator(service);
        System.out.println(decorator.sayMsg());
    }
}
