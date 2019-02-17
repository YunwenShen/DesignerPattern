package com.cucci.chain;

/**
 * 总经理
 *
 * @author shenyw
 **/
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        this.name = name;
    }

    @Override
    public void dealWithApply(Apply apply) {
        if (apply.getType().equals("请假")) {
            System.out.println(String.format("%s: %s 数量 %d 被批准", name, apply.getType(), apply.getSize()));
        } else if (apply.getType().equals("加薪") && apply.getSize() <= 500) {
            System.out.println(String.format("%s: %s 数量 %d 被批准", name, apply.getType(), apply.getSize()));
        } else if (apply.getType().equals("加薪") && apply.getSize() > 500) {
            System.out.println(String.format("%s: %s 数量 %d 再说吧", name, apply.getType(), apply.getSize()));
        }
    }
}
