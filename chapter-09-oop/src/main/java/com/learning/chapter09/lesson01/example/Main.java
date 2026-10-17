package com.learning.chapter09.lesson01.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 01. 객체지향이란? - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/481
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character("전사", 100);
        warrior.showStatus();

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
