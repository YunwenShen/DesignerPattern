package com.cucci.iterator;

/**
 * 迭代器测试
 *
 * @author shenyw
 **/
public class IteratorTest {


    public static void main(String[] args) {
        FilmMenu filmMenu = new FilmMenu();
        TVChannelMenu tvChannelMenu = new TVChannelMenu();
        System.out.println("电视节目有：");
        printMenu(tvChannelMenu.createIterator());
        System.out.println("电影节目有：");
        printMenu(filmMenu.createIterator());

    }

    public static void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print("channel:" + menuItem.getChannel() + ",");
            System.out.print("name:" + menuItem.getName() + ",");
            System.out.println("description:" + menuItem.getDescription());
        }
    }
}
