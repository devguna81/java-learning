package com.learning.chapter09.lesson06.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 06. extends - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/486
 */

public class Main {

    public static void main(String[] args) {

        Archer archer = new Archer("궁수", 70);
        archer.showStatus();

    }
}

class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}

class Archer extends Character {
    Archer(String name, int hp) {
        super(name, hp);
    }
}
