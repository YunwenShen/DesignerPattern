package com.cucci.observer;

/**
 * @author shenyw
 **/
public class ObserverTest {
    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver stock = new StockObserver("徐荣平", boss);
        NBAObserver nba = new NBAObserver("张贵明", boss);

        boss.attach(stock);
        boss.attach(nba);

        boss.subjectState = "魏永锋回来了";
        boss.subjectNotify();
    }


}
