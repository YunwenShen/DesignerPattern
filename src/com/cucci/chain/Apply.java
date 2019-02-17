package com.cucci.chain;

/**
 * 申请
 *
 * @author shenyw
 **/
public class Apply {

    /**
     * 申请类型
     */
    private String type;

    /**
     * 申请内容
     */
    private String content;

    /**
     * 申请数量
     */
    private int size;

    public Apply(String type, String content, int size) {
        this.type = type;
        this.content = content;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
