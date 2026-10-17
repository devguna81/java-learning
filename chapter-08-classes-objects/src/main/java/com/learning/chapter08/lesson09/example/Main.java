package com.learning.chapter08.lesson09.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 09. 실습 - 캐릭터 클래스 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/479
 */

public class Main {

    public static void main(String[] args) {

        Character player = new Character("전사", 30);

        player.showStatus();
        player.takeDamage(20);
        player.showStatus();
        player.takeDamage(20);
        player.showStatus();
        player.heal(50);
        player.showStatus();

    }
}

class Character {
    String name;
    int hp;
    boolean isAlive;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

    void takeDamage(int damage) {
        if (!isAlive) {
            System.out.println(name + "은(는) 이미 쓰러졌습니다");
            return;
        }
        hp = hp - damage;
        if (hp <= 0) {
            hp = 0;
            isAlive = false;
            System.out.println(name + "이(가) 쓰러졌습니다!");
        }
    }

    void heal(int amount) {
        if (!isAlive) {
            System.out.println(name + "은(는) 회복할 수 없습니다(사망 상태)");
            return;
        }
        hp = hp + amount;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp + ", 생존: " + isAlive);
    }
}
