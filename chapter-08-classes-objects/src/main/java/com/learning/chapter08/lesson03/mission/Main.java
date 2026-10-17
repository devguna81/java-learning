package com.learning.chapter08.lesson03.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 03. 필드(멤버 변수) - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/473
 */

public class Main {

    public static void main(String[] args) {

        Monster goblin = new Monster();
        goblin.name = "고블린";
        goblin.hp = 35;
        goblin.attackPower = 8;

        System.out.println(goblin.name + ": " + goblin.hp + " / " + goblin.attackPower);

    }
}

class Monster {
    String name;
    int hp;
    int attackPower;
}
