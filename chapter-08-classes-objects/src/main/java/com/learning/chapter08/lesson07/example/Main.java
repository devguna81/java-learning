package com.learning.chapter08.lesson07.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 07. 여러 객체 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/477
 */

public class Main {

    public static void main(String[] args) {

        Character player = new Character("전사", 100);
        Character enemy1 = new Character("고블린", 30);
        Character enemy2 = new Character("슬라임", 20);

        System.out.println("=== 변경 전 ===");
        player.showInfo();
        enemy1.showInfo();
        enemy2.showInfo();

        player.hp = 50;

        System.out.println("=== player만 변경 후 ===");
        player.showInfo();
        enemy1.showInfo();
        enemy2.showInfo();

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
        System.out.println(name + "의 HP: " + hp);
    }
}
