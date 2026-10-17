package com.learning.chapter09.lesson03.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 03. public과 private - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/483
 */

public class Main {

    public static void main(String[] args) {

        Character archer = new Character("궁수", 60);
        archer.takeDamage(60);
        archer.showStatus();

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
