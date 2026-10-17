package com.learning.chapter08.lesson05.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 05. 생성자 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/475
 */

public class Main {

    public static void main(String[] args) {

        Character player = new Character("전사", 100);
        Character enemy = new Character("고블린", 35);

        player.showInfo();
        enemy.showInfo();

    }
}

class Character {
    String name;
    int hp;

    Character(String initialName, int initialHp) {
        name = initialName;
        hp = initialHp;
    }

    void showInfo() {
        System.out.println(name + "의 HP: " + hp);
    }
}
