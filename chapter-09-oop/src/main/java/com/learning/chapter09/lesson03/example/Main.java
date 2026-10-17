package com.learning.chapter09.lesson03.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 03. public과 private - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/483
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character("전사", 100);
        warrior.takeDamage(150);
        warrior.showStatus();

    }
}

class Character {
    String name;
    private int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void takeDamage(int damage) {
        hp = hp - damage;
        if (hp < 0) {
            hp = 0;
        }
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다");
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}
