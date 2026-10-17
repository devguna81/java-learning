package com.learning.chapter09.lesson02.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 02. 캡슐화 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/482
 */

public class Main {

    public static void main(String[] args) {

        Character archer = new Character("궁수", 60);
        archer.hp = -30;
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
