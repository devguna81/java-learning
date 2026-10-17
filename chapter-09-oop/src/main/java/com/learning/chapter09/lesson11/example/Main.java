package com.learning.chapter09.lesson11.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 11. 실습 - Monster, Zombie, Skeleton, Creeper - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/491
 */

public class Main {

    public static void main(String[] args) {

        Monster[] monsters = new Monster[3];
        monsters[0] = new Zombie("좀비", 20);
        monsters[1] = new Skeleton("스켈레톤", 15);
        monsters[2] = new Creeper("크리퍼", 20);

        for (int i = 0; i < monsters.length; i++) {
            monsters[i].attack();
        }

        Creeper creeper = (Creeper) monsters[2];
        creeper.explode();

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

interface Explodable {
    void explode();
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

class Skeleton extends Monster {
    Skeleton(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 화살을 쏩니다");
    }
}

class Creeper extends Monster implements Explodable {
    Creeper(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 다가옵니다");
    }

    @Override
    public void explode() {
        System.out.println(name + "이(가) 폭발합니다!");
    }
}
