package com.learning.chapter09.lesson11.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 11. 실습 - Monster, Zombie, Skeleton, Creeper - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/491
 */

public class Main {

    public static void main(String[] args) {

        Monster[] monsters = new Monster[2];
        monsters[0] = new Zombie("좀비", 20);
        monsters[1] = new Witch("마녀", 18);

        for (int i = 0; i < monsters.length; i++) {
            monsters[i].attack();
        }

    }
}

abstract class Monster {
    String name;
    int hp;

    Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    abstract void attack();
}

class Zombie extends Monster {
    Zombie(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 팔을 휘두릅니다");
    }
}

class Witch extends Monster {
    Witch(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 독물약을 던집니다");
    }
}
