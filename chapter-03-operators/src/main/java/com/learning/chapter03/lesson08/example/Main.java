package com.learning.chapter03.lesson08.example;

/**
 * [Chapter 03. 연산자]
 * 08. 연산 순서 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/427
 */

public class Main {

    public static void main(String[] args) {

        int result1 = 2 + 3 * 4;
        System.out.println("2 + 3 * 4 = " + result1);

        int result2 = (2 + 3) * 4;
        System.out.println("(2 + 3) * 4 = " + result2);

        boolean result3 = 10 > 5 && 3 < 1;
        System.out.println("10 > 5 && 3 < 1 = " + result3);

        boolean result4 = 10 > 5 || 3 < 1;
        System.out.println("10 > 5 || 3 < 1 = " + result4);

    }
}
