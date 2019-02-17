package com.cucci.chain;

/**
 * 经理
 *
 * @author shenyw
 **/
public class CommonManager extends Manager {

    public CommonManager(String name) {
        this.name = name;
    }

    @Override
    public void dealWithApply(Apply apply) {
        if (apply.getType().equals("请假") && apply.getSize() <= 2) {
            System.out.println(String.format("%s: %s 数量 %d 被批准", name, apply.getType(), apply.getSize()));
        } else {
            if (superior != null) {
                superior.dealWithApply(apply);
            }
        }
    }
}
