package com.cucci.iterator;

/**
 * 电影菜单
 *
 * @author shenyw
 **/
public class FilmMenu implements Menu {
    private static final int MAX_ITEM = 5;
    private MenuItem[] menuItems;
    private int numberOfItems = 0;

    public FilmMenu() {
        menuItems = new MenuItem[MAX_ITEM];

        addItem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
        addItem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
        addItem(3, "黑客帝国123", "不知道你能够看懂不???");
        addItem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
        addItem(5, "肖申克的救赎", "自由，幸福，离你有多远");
    }

    @Override
    public void addItem(int channel, String name, String description) {
        if (numberOfItems > MAX_ITEM) {
            System.out.println("不好意思菜单已满");
        } else {
            MenuItem item = new MenuItem(channel, name, description);
            menuItems[numberOfItems] = item;
            numberOfItems++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new FilmMenuIterator(menuItems);
    }
}
