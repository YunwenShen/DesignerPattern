package com.cucci.observer;

/**
 * 观察者对象（看nba的同事）
 *
 * @author shenyw
 **/
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(String.format("%s %s 关闭NBA比赛, 继续工作！", subject.subjectState, name));
    }
}
