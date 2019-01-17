package com.cucci.observer;

/**
 * 观察者对象（看股票的同事）
 *
 * @author shenyw
 **/
public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭股票行情, 继续工作！", subject.subjectState, name));
    }
}
