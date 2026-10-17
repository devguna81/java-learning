package com.learning.chapter09.lesson01.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 01. 객체지향이란? - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/481
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character("전사", 100);
        Character mage = new Character("마법사", 80);

        warrior.showStatus();
        mage.showStatus();

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
