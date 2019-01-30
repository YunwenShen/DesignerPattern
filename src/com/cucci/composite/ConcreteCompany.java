package com.cucci.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类 （树枝节点）
 *
 * @author shenyw
 **/
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            line.append("-");
        }
        System.out.println(line + name);
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineOfDuty() {
        for (Company company : children) {
            company.lineOfDuty();
        }
    }
}
