package com.learning.chapter14.lesson07.example;

/**
 * [Chapter 14. Modern Java]
 * 07. Pattern Matching - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/535
 */

public class Main {

    public static void main(String[] args) {

        Object monster = new Creeper("크리퍼");

        if (monster instanceof Creeper) {
            Creeper c = (Creeper) monster;
            c.explode();
        } else {
            System.out.println("폭발할 수 없습니다");
        }

    }
}

class Creeper {
    String name;

    Creeper(String name) {
        this.name = name;
    }

    void explode() {
        System.out.println(name + "이(가) 폭발합니다!");
    }
}
