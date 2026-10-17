package com.learning.chapter02.lesson01.mission;

/**
 * [Chapter 02. 변수]
 * 01. 변수란 무엇인가? - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/410
 */

public class Main {

    public static void main(String[] args) {

        int hp = 30;
        System.out.println("시작 체력: " + hp);

        hp = hp - 5;
        System.out.println("1차 공격 후 체력: " + hp);

        hp = hp - 8;
        System.out.println("2차 공격 후 체력: " + hp);

        hp = hp - 0;
        System.out.println("3차 공격 후 체력: " + hp);

    }
}
