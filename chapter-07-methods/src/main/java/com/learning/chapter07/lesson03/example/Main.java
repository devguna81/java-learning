package com.learning.chapter07.lesson03.example;

/**
 * [Chapter 07. 메서드]
 * 03. 매개변수 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/464
 */

public class Main {

    public static void attack(int monsterNo) {
        System.out.println(monsterNo + "번 몬스터를 공격!");
    }

    public static void main(String[] args) {

        attack(1);
        attack(2);
        attack(3);

    }
}
