package com.cucci.decorator;

/**
 * 第三方引用实现类
 *
 * @author shenyw
 **/
public class ThirdPartyServiceImpl implements IThirdPartyService {
    @Override
    public String sayMsg() {
        return "hello world";
    }
}
