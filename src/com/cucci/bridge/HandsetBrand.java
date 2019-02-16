package com.cucci.bridge;

/**
 * 手机品牌
 *
 * @author shenyw
 **/
public abstract class HandsetBrand {

    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();

}
