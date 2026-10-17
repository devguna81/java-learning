package com.learning.chapter06.lesson01.example;

/**
 * [Chapter 06. 배열]
 * 01. 배열이 필요한 이유 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/453
 */

public class Main {

    public static void main(String[] args) {

        int hp1 = 30;
        int hp2 = 25;
        int hp3 = 40;

        System.out.println("1번 몬스터 HP: " + hp1);
        System.out.println("2번 몬스터 HP: " + hp2);
        System.out.println("3번 몬스터 HP: " + hp3);

        int total = hp1 + hp2 + hp3;
        System.out.println("HP 합계: " + total);

    }
}
