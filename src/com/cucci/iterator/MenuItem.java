package com.cucci.iterator;

/**
 * 节目菜单
 *
 * @author shenyw
 **/
public class MenuItem {

    /**
     * 节目名称
     */
    private String name;

    /**
     * 节目描述
     */
    private String description;

    /**
     * 节目频道
     */
    private int channel;

    public MenuItem(int channel, String name, String description) {
        this.channel = channel;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
