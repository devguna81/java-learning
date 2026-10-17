package com.learning.adventure.lesson03.mission;

/**
 * [Final Project. Java Adventure]
 * 03. Monster 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/584
 */

public class Main {

    public static void main(String[] args) {

        Monster slime = new Slime();
        slime.roar();

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

class Slime extends Monster {
    Slime() {
        super("슬라임", 15, 4);
    }

    @Override
    void roar() {
        System.out.println(name + "이(가) 꿈틀거립니다");
    }
}
