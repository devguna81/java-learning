package com.learning.chapter12.lesson09.example;

/**
 * [Chapter 12. 예외와 오류]
 * 09. Stack Trace 읽기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/519
 */

public class Main {

    public static void main(String[] args) {

        try {
            divide(100, 0);
        } catch (ArithmeticException e) {
            System.out.println("예외 종류: " + e.getClass().getSimpleName());
            System.out.println("메시지: " + e.getMessage());
        }

    }

    static int divide(int a, int b) {
        return a / b;
    }
}
