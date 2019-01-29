package com.cucci.memento;

/**
 * 角色状态管理者类/ Caretaker（管理者）
 *
 * @author shenyw
 **/
public class GameRoleStateCaretaker {

    private GameRoleStateMemento memento;

    public GameRoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(GameRoleStateMemento memento) {
        this.memento = memento;
    }
}
