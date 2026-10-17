package com.learning.chapter09.lesson09.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 09. 추상 클래스 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/489
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Warrior("전사", 100);
        Character mage = new Mage("마법사", 80);

        warrior.attack();
        mage.attack();

    }
}

abstract class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    abstract void attack();
}

class Warrior extends Character {
    Warrior(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 검을 휘두릅니다");
    }
}

class Mage extends Character {
    Mage(String name, int hp) {
        super(name, hp);
    }

    @Override
    void attack() {
        System.out.println(name + "이(가) 파이어볼을 던집니다");
    }
}
