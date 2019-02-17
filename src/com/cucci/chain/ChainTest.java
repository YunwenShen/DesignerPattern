package com.cucci.chain;

/**
 * 职责链模式测试类
 *
 * @author shenyw
 **/
public class ChainTest {

    public static void main(String[] args) {

        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");
        commonManager.setSuperior(majordomo);
        majordomo.setSuperior(generalManager);

        Apply apply1 = new Apply("请假", "小菜请假", 1);
        commonManager.dealWithApply(apply1);

        Apply apply2 = new Apply("请假", "小菜请假", 4);
        commonManager.dealWithApply(apply2);

        Apply apply3 = new Apply("加薪", "小菜加薪", 500);
        commonManager.dealWithApply(apply3);

        Apply apply4 = new Apply("加薪", "小菜加薪", 1000);
        commonManager.dealWithApply(apply4);

    }
}
