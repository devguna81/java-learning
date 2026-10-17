package com.learning.adventure.lesson09.example;

/**
 * [Final Project. Java Adventure]
 * 09. 게임 흐름 완성하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/590
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Player hero = new Player("전사");
        Inventory inventory = new Inventory();
        inventory.addItem("포션", 2);
        Item potion = new Item("포션", 30);

        hero.showStatus();

        battle(hero, new Zombie());

        inventory.useItem("포션", hero, potion);
        hero.showStatus();

        battle(hero, new Skeleton());
        battle(hero, new Boss());

        System.out.println("=== " + hero.name + "의 모험 완료! ===");

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

class Zombie extends Monster {
    Zombie() {
        super("좀비", 30, 8, 60);
    }

    @Override
    void attack(Player target) {
        System.out.println(name + "이(가) 팔을 휘두릅니다");
        target.takeDamage(power);
    }
}

class Skeleton extends Monster {
    Skeleton() {
        super("스켈레톤", 25, 10, 50);
    }

    @Override
    void attack(Player target) {
        System.out.println(name + "이(가) 화살을 쏩니다");
        target.takeDamage(power);
    }
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

class Inventory {
    Map<String, Integer> items;

    Inventory() {
        items = new HashMap<>();
    }

    void addItem(String name, int count) {
        if (items.containsKey(name)) {
            items.put(name, items.get(name) + count);
        } else {
            items.put(name, count);
        }
    }

    boolean hasItem(String name) {
        return items.containsKey(name) && items.get(name) > 0;
    }

    void useItem(String name, Player player, Item item) {
        if (hasItem(name)) {
            items.put(name, items.get(name) - 1);
            item.use(player);
        } else {
            System.out.println(name + "이(가) 없습니다");
        }
    }
}
