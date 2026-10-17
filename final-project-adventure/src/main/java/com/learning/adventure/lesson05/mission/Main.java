package com.learning.adventure.lesson05.mission;

/**
 * [Final Project. Java Adventure]
 * 05. 아이템 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/586
 */

public class Main {

    public static void main(String[] args) {

        Player hero = new Player("전사");
        battle(hero, new Skeleton());

        Item potion = new Item("포션", 30);
        potion.use(hero);
        hero.showStatus();

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

    Player(String name) {
        this.name = name;
        this.hp = 100;
        this.maxHp = 100;
        this.power = 10;
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

    void showStatus() {
        System.out.println(name + " - HP: " + hp + "/" + maxHp + ", 공격력: " + power);
    }
}

abstract class Monster {
    String name;
    int hp;
    int power;

    Monster(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
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

class Skeleton extends Monster {
    Skeleton() {
        super("스켈레톤", 25, 10);
    }

    @Override
    void attack(Player target) {
        System.out.println(name + "이(가) 화살을 쏩니다");
        target.takeDamage(power);
    }
}

class Item {
    String name;
    int healAmount;

    Item(String name, int healAmount) {
        this.name = name;
        this.healAmount = healAmount;
    }

    void use(Player player) {
        player.hp = player.hp + healAmount;
        if (player.hp > player.maxHp) {
            player.hp = player.maxHp;
        }
        System.out.println(player.name + "이(가) " + name + "을(를) 사용해 " + healAmount + "만큼 회복했습니다");
    }
}
