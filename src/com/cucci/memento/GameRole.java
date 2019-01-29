package com.cucci.memento;

/**
 * 游戏角色/Originator（发起人）
 *
 * @author shenyw
 **/
public class GameRole {

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

    /**
     * 角色性别是否为男性
     */
    private boolean male;

    public GameRole() {
        this.blood = 100;
        this.attack = 100;
        this.defense = 100;
    }

    /**
     * 显示属性
     */
    public void display() {
        System.out.println("-----------------");
        System.out.println("角色信息");
        System.out.println("血量：" + blood);
        System.out.println("攻击力：" + attack);
        System.out.println("防御力：" + defense);
    }

    /**
     * 参加战斗
     */
    public void fight() {
        blood = (int) (blood * 0.5);
        attack = (int) (attack * 0.5);
        defense = (int) (defense * 0.5);
    }

    /**
     * 保存备忘录
     *
     * @return
     */
    public GameRoleStateMemento saveMemento() {
        return new GameRoleStateMemento(blood, attack, defense);
    }

    /**
     * 通过备忘录恢复角色信息
     *
     * @param memento
     */
    public void recoveryByMemento(GameRoleStateMemento memento) {
        this.blood = memento.getBlood();
        this.attack = memento.getAttack();
        this.defense = memento.getDefense();
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

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
