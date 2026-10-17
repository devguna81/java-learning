package com.learning.chapter09.lesson05.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 05. 상속 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/485
 */

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss("두목", 200);
        Minion minion = new Minion("부하", 50);

        boss.showStatus();
        minion.showStatus();

    }
}

class Boss {
    String name;
    int hp;

    Boss(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}

class Minion {
    String name;
    int hp;

    Minion(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}
