package com.learning.chapter08.lesson06.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 06. this 키워드 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/476
 */

public class Main {

    public static void main(String[] args) {

        Character player = new Character("전사", 100);
        player.showInfo();

    }
}

class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showInfo() {
        System.out.println(this.name + "의 HP: " + this.hp);
    }
}
