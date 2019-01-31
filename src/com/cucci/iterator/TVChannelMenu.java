package com.cucci.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 电视节目
 *
 * @author shenyw
 **/
public class TVChannelMenu implements Menu {

    private List<MenuItem> items;

    public TVChannelMenu() {
        items = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    @Override
    public void addItem(int channel, String name, String description) {
        MenuItem item = new MenuItem(channel, name, description);
        items.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new TVChannelMenuIterator(items);
    }
}
