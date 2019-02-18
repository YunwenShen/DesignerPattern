package com.cucci.mediator;

/**
 * 联合国安全理事会（中介者类的具体实现）
 *
 * @author shenyw@citycloud.com.cn
 **/
public class UnitedNationsSecurityCouncil extends UnitedNations {

    private USA usa;

    private Iraq iraq;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String msg, Country country) {
        if (country instanceof USA) {
            iraq.getMessage(msg);
        } else {
            usa.getMessage(msg);
        }
    }
}
