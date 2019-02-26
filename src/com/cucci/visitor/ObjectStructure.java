package com.cucci.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据结构
 *
 * @author shenyw
 **/
public class ObjectStructure {

    private List<Action> actions = new ArrayList<>();

    /**
     * 新增事件
     *
     * @param action
     */
    public void attach(Action action) {
        actions.add(action);
    }

    /**
     * 删除事件
     *
     * @param action
     */
    public void detach(Action action) {
        actions.remove(action);
    }

    /**
     * 访问事件
     *
     * @param person
     */
    public void accept(Person person) {
        for (Action action : actions) {
            person.accept(action);
        }
    }
}
