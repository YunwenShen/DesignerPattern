package com.cucci.iterator;

/**
 * 电影节目迭代器
 *
 * @author shenyw
 **/
public class FilmMenuIterator implements Iterator {

    private MenuItem[] items;

    private int position = 0;

    public FilmMenuIterator(MenuItem[] menuItems) {
        this.items = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position > items.length - 1 || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items[position];
        position++;
        return item;
    }
}
