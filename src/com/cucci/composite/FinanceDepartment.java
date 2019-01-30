package com.cucci.composite;

/**
 * 财务部（树叶节点）
 *
 * @author shenyw
 **/
public class FinanceDepartment extends Company {
    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            line.append("-");
        }
        System.out.println(line + name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 公司财务收支管理");
    }
}
