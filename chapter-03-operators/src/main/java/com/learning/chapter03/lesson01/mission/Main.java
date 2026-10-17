package com.learning.chapter03.lesson01.mission;

/**
 * [Chapter 03. 연산자]
 * 01. Java에게 계산시키기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/420
 */

public class Main {

    public static void main(String[] args) {

        int x = 20;
        int y = 10;

        System.out.println("합계: " + (x + y));
        System.out.println("차이가 있다: " + (x != y));
        System.out.println("둘 다 양수: " + (x > 0 && y > 0));
        System.out.println("증가 후: " + (++x));
        System.out.println("누적 결과: " + (y += 5));

    }
}
