package com.learning.adventure.lesson03.example;

/**
 * [Final Project. Java Adventure]
 * 03. Monster 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/584
 */

public class Main {

    public static void main(String[] args) {

        Monster zombie = new Zombie();
        Monster skeleton = new Skeleton();

        zombie.roar();
        skeleton.roar();

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

    abstract void roar();
}

class Zombie extends Monster {
    Zombie() {
        super("좀비", 30, 8);
    }

    @Override
    void roar() {
        System.out.println(name + "이(가) 신음소리를 냅니다");
    }
}

class Skeleton extends Monster {
    Skeleton() {
        super("스켈레톤", 25, 10);
    }

    @Override
    void roar() {
        System.out.println(name + "이(가) 뼈를 부딪힙니다");
    }
}
