package com.cucci.composite;

/**
 * 组合模式
 *
 * @author shenyw
 **/
public class CompositeTest {

    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company1 = new ConcreteCompany("上海华东分公司");
        company1.add(new HRDepartment("华东分公司人力资源部"));
        company1.add(new FinanceDepartment("华东分公司财务部"));
        root.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("南京办事处");
        company2.add(new HRDepartment("南京办事处人力资源部"));
        company2.add(new FinanceDepartment("南京办事处财务部"));
        root.add(company2);

        ConcreteCompany company3 = new ConcreteCompany("杭州办事处");
        company3.add(new HRDepartment("杭州办事处人力资源部"));
        company3.add(new FinanceDepartment("杭州办事处财务部"));
        root.add(company3);

        System.out.println("\n 结构图：");
        root.display(1);

        System.out.println("\n 职责：");
        root.lineOfDuty();
    }
}
