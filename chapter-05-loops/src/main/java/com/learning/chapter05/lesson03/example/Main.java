package com.learning.chapter05.lesson03.example;

/**
 * [Chapter 05. 반복문]
 * 03. while - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/441
 */

public class Main {

    public static void main(String[] args) {

        int hp = 30;

        while (hp > 0) {
            hp = hp - 10;
            System.out.println("공격! 남은 HP: " + hp);
        }

        System.out.println("몬스터를 처치했습니다");

    }
}
