package com.cucci.chain;

/**
 * 总监
 *
 * @author shenyw
 **/
public class Majordomo extends Manager {

    public Majordomo(String name) {
        this.name = name;
    }

    @Override
    public void dealWithApply(Apply apply) {
        if (apply.getType().equals("请假") && apply.getSize() <= 5) {
            System.out.println(String.format("%s: %s 数量 %d 被批准", name, apply.getType(), apply.getSize()));
        } else {
            if (superior != null) {
                superior.dealWithApply(apply);
            }
        }
    }
}
