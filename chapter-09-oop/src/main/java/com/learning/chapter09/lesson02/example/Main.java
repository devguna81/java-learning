package com.learning.chapter09.lesson02.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 02. 캡슐화 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/482
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character("전사", 100);
        warrior.hp = -50;
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
