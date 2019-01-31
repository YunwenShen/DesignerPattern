package com.cucci.iterator;

import java.util.List;

/**
 * 电视节目迭代器
 *
 * @author shenyw
 **/
public class TVChannelMenuIterator implements Iterator {

    private List<MenuItem> items;

    private int position = 0;

    public TVChannelMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position > items.size() - 1 || items.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position++;
        return item;
    }
}
