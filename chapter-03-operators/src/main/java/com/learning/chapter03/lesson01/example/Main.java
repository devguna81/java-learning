package com.learning.chapter03.lesson01.example;

/**
 * [Chapter 03. 연산자]
 * 01. Java에게 계산시키기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/420
 */

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("산술: " + (a + b));
        System.out.println("비교: " + (a > b));
        System.out.println("논리: " + (a > b && b > 0));
        System.out.println("증가: " + (++a));
        System.out.println("대입: " + (b += 5));

    }
}
