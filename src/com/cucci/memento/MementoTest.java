package com.cucci.memento;

/**
 * 备忘录模式测试
 *
 * @author shenyw
 **/
public class MementoTest {

    public static void main(String[] args) {
        // 参加战斗之前的状态
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.display();

        // 保存进度
        GameRoleStateCaretaker caretaker = new GameRoleStateCaretaker();
        caretaker.setMemento(lixiaoyao.saveMemento());

        // 参与战斗
        lixiaoyao.fight();
        lixiaoyao.display();

        // 战斗失败，读之前保存的进度恢复
        lixiaoyao.recoveryByMemento(caretaker.getMemento());
        lixiaoyao.display();
    }
}
