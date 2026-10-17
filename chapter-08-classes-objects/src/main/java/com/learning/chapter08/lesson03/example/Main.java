package com.learning.chapter08.lesson03.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 03. 필드(멤버 변수) - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/473
 */

public class Main {

    public static void main(String[] args) {

        Character player = new Character();

        System.out.println("이름 기본값: " + player.name);
        System.out.println("HP 기본값: " + player.hp);
        System.out.println("생존 여부 기본값: " + player.isAlive);

        player.name = "전사";
        player.hp = 100;
        player.isAlive = true;

        System.out.println("이름: " + player.name + ", HP: " + player.hp + ", 생존: " + player.isAlive);

    }
}

class Character {
    String name;
    int hp;
    int level;
    boolean isAlive;
}
