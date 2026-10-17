package com.learning.chapter09.lesson10.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 10. Interface - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/490
 */

public class Main {

    public static void main(String[] args) {

        Creeper creeper = new Creeper("크리퍼", 20);
        creeper.attack();
        creeper.explode();

    }
}

interface Explodable {
    void explode();
}

class Creeper implements Explodable {
    String name;
    int hp;

    Creeper(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println(name + "이(가) 다가옵니다");
    }

    @Override
    public void explode() {
        System.out.println(name + "이(가) 폭발합니다!");
    }
}
