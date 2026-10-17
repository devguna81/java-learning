package com.learning.adventure.game;

/**
 * 몬스터 추상 클래스.
 * 모든 몬스터 종류(Zombie, Skeleton, Boss 등)의 공통 속성 및 공격 행위를 정의합니다.
 */
public abstract class Monster {
    protected String name;
    protected int hp;
    protected int power;
    protected int expReward;

    public Monster(String name, int hp, int power, int expReward) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.expReward = expReward;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        this.hp = Math.max(0, this.hp - damage);
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다. (남은 HP: " + hp + ")");
    }

    public abstract void attack(Player target);

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getPower() { return power; }
    public int getExpReward() { return expReward; }
}
