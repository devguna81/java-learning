package com.learning.chapter09.lesson05.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 05. 상속 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/485
 */

public class Main {

    public static void main(String[] args) {

        Warrior warrior = new Warrior("전사", 100);
        Mage mage = new Mage("마법사", 80);

        warrior.showStatus();
        mage.showStatus();

    }
}

class Warrior {
    String name;
    int hp;

    Warrior(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}

class Mage {
    String name;
    int hp;

    Mage(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp);
    }
}
