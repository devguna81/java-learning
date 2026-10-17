package com.learning.chapter09.lesson07.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 07. Override - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/487
 */

public class Main {

    public static void main(String[] args) {

        Archer archer = new Archer("궁수", 70);
        archer.attack();

    }
}

class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println(name + "이(가) 공격합니다");
    }
}

class Archer extends Character {
    Archer(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 화살을 쏩니다");
    }
}
