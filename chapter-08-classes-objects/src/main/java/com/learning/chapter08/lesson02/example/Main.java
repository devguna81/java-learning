package com.learning.chapter08.lesson02.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 02. 클래스 선언과 객체 생성 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/472
 */

public class Main {

    public static void main(String[] args) {

        Character player1 = new Character();
        player1.name = "전사";
        player1.hp = 100;

        Character player2 = new Character();
        player2.name = "마법사";
        player2.hp = 80;

        System.out.println(player1.name + "의 HP: " + player1.hp);
        System.out.println(player2.name + "의 HP: " + player2.hp);

    }
}

class Character {
    String name;
    int hp;
}
