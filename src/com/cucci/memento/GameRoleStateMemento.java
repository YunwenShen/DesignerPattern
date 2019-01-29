package com.cucci.memento;

/**
 * 游戏角色状态存储器/ Memento（备忘录）
 *
 * @author shenyw
 **/
public class GameRoleStateMemento {

    /**
     * 血量
     */
    private int blood;

    /**
     * 攻击力
     */
    private int attack;

    /**
     * 防御力
     */
    private int defense;

    public GameRoleStateMemento(int blood, int attack, int defense) {
        this.blood = blood;
        this.attack = attack;
        this.defense = defense;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
