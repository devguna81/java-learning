package com.learning.adventure.lesson04.example;

/**
 * [Final Project. Java Adventure]
 * 04. 전투 시스템 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/585
 */

public class Main {

    public static void main(String[] args) {

        Player hero = new Player("전사");
        battle(hero, new Zombie());

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

class Zombie extends Monster {
    Zombie() {
        super("좀비", 30, 8);
    }

    @Override
    void attack(Player target) {
        System.out.println(name + "이(가) 팔을 휘두릅니다");
        target.takeDamage(power);
    }
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
