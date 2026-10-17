package com.learning.adventure.game;

/**
 * 모험가(플레이어) 클래스.
 * 이름, HP, 공격력, 레벨, 경험치 정보를 관리하고 전투/성장 로직을 수행합니다.
 */
public class Player {
    private String name;
    private int hp;
    private int maxHp;
    private int power;
    private int level;
    private int exp;

    public Player(String name) {
        this.name = name;
        this.hp = 100;
        this.maxHp = 100;
        this.power = 10;
        this.level = 1;
        this.exp = 0;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        this.hp = Math.max(0, this.hp - damage);
    }

    public void attack(Monster target) {
        System.out.println(name + "이(가) " + target.getName() + "을(를) 공격합니다!");
        target.takeDamage(power);
    }

    public void heal(int amount) {
        this.hp = Math.min(this.maxHp, this.hp + amount);
        System.out.println(name + "의 HP가 " + amount + " 회복되었습니다. (현재 HP: " + hp + "/" + maxHp + ")");
    }

    public void gainExp(int amount) {
        this.exp += amount;
        System.out.println(amount + " 경험치를 획득했습니다. (현재 경험치: " + exp + ")");
        while (this.exp >= 100) {
            this.exp -= 100;
            this.level++;
            this.power += 5;
            this.maxHp += 20;
            this.hp = this.maxHp;
            System.out.println("✨ [LEVEL UP!] " + name + "의 레벨이 " + level + "로 올랐습니다! (최대 HP: " + maxHp + ", 공격력: " + power + ")");
        }
    }

    public void showStatus() {
        System.out.println(String.format("📊 [%s] Lv.%d | HP: %d/%d | 공격력: %d | EXP: %d/100", 
            name, level, hp, maxHp, power, exp));
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
    public int getMaxHp() { return maxHp; }
    public int getPower() { return power; }
    public int getLevel() { return level; }
}
