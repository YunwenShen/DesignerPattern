package com.cucci.visitor;

/**
 * 成功
 *
 * @author shenyw
 **/
public class Success extends Action {
    @Override
    public void getManConclusion(Man man) {
        System.out.println("男人成功时，背后多半有一个伟大的女人");
    }

    @Override
    public void getWomanConclusion(Woman woman) {
        System.out.println("女人成功时，背后多半有一个不成功得男人");
    }
}
