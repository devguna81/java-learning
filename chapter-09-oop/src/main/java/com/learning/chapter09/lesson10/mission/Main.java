package com.learning.chapter09.lesson10.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 10. Interface - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/490
 */

public class Main {

    public static void main(String[] args) {

        Priest priest = new Priest("사제", 50);
        priest.heal(20);
        priest.showStatus();

    }
}

interface Healable {
    void heal(int amount);
}

class Priest implements Healable {
    String name;
    int hp;

    Priest(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override
    public void heal(int amount) {
        hp = hp + amount;
        System.out.println(name + "이(가) " + amount + "만큼 회복했습니다");
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}
