package com.learning.adventure.lesson08.example;

/**
 * [Final Project. Java Adventure]
 * 08. Boss 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/589
 */

public class Main {

    public static void main(String[] args) {

        Player hero = new Player("전사");
        battle(hero, new Boss());

    }

    static void battle(Player player, Monster monster) {
        System.out.println("=== " + monster.name + "와(과)의 전투 시작 ===");
        while (player.isAlive() && monster.isAlive()) {
            player.attack(monster);
            if (!monster.isAlive()) {
                break;
            }
            monster.attack(player);
        }
        if (player.isAlive()) {
            System.out.println(monster.name + "을(를) 처치했습니다!");
            player.gainExp(monster.expReward);
        } else {
            System.out.println(player.name + "이(가) 쓰러졌습니다...");
        }
        player.showStatus();
    }
}

class Player {
    String name;
    int hp;
    int maxHp;
    int power;
    int level;
    int exp;

    Player(String name) {
        this.name = name;
        this.hp = 100;
        this.maxHp = 100;
        this.power = 10;
        this.level = 1;
        this.exp = 0;
    }

    boolean isAlive() {
        return hp > 0;
    }

    void takeDamage(int damage) {
        hp = hp - damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    void attack(Monster target) {
        System.out.println(name + "이(가) " + target.name + "을(를) 공격합니다");
        target.takeDamage(power);
    }

    void gainExp(int amount) {
        exp = exp + amount;
        while (exp >= 100) {
            exp = exp - 100;
            level = level + 1;
            power = power + 5;
            maxHp = maxHp + 20;
            hp = maxHp;
            System.out.println(name + "이(가) 레벨업했습니다! (레벨 " + level + ")");
        }
    }

    void showStatus() {
        System.out.println(name + " - 레벨: " + level + ", 경험치: " + exp + ", HP: " + hp + "/" + maxHp + ", 공격력: " + power);
    }
}

abstract class Monster {
    String name;
    int hp;
    int power;
    int expReward;

    Monster(String name, int hp, int power, int expReward) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.expReward = expReward;
    }

    boolean isAlive() {
        return hp > 0;
    }

    void takeDamage(int damage) {
        hp = hp - damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    abstract void attack(Player target);
}

class Boss extends Monster {
    Boss() {
        super("몬스터 대왕", 80, 15, 150);
    }

    @Override
    void attack(Player target) {
        System.out.println(name + "이(가) 강력한 일격을 날립니다");
        target.takeDamage(power);
    }
}
