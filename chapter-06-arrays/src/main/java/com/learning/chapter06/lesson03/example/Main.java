package com.learning.chapter06.lesson03.example;

/**
 * [Chapter 06. 배열]
 * 03. 배열 초기화 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/455
 */

public class Main {

    public static void main(String[] args) {

        int[] hp = {30, 25, 40};

        System.out.println("0번 몬스터 HP: " + hp[0]);
        System.out.println("1번 몬스터 HP: " + hp[1]);
        System.out.println("2번 몬스터 HP: " + hp[2]);

        hp[0] = 50;
        System.out.println("공격 후 0번 몬스터 HP: " + hp[0]);

    }
}
