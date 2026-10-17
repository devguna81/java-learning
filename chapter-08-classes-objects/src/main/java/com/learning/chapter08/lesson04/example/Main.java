package com.learning.chapter08.lesson04.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 04. 인스턴스 메서드 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/474
 */

public class Main {

    public static void main(String[] args) {

        Character player = new Character();
        player.name = "전사";
        player.hp = 100;

        Character enemy = new Character();
        enemy.name = "고블린";
        enemy.hp = 35;

        player.showInfo();
        enemy.showInfo();

    }
}

class Character {
    String name;
    int hp;

    void showInfo() {
        System.out.println(name + "의 HP: " + hp);
    }
}
