package com.learning.chapter09.lesson08.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 08. 다형성 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/488
 */

public class Main {

    public static void main(String[] args) {

        Character[] party = new Character[2];
        party[0] = new Warrior("전사", 100);
        party[1] = new Archer("궁수", 70);

        for (int i = 0; i < party.length; i++) {
            party[i].attack();
        }

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

class Warrior extends Character {
    Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 검을 휘두릅니다");
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
