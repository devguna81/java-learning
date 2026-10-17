package com.learning.chapter07.lesson08.mission;

/**
 * [Chapter 07. 메서드]
 * 08. 실습 - 계산기 메서드 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/469
 */

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int calculate(int a, char op, int b) {
        if (op == '+') {
            return add(a, b);
        } else if (op == '-') {
            return subtract(a, b);
        } else if (op == '*') {
            return multiply(a, b);
        } else if (op == '/') {
            return divide(a, b);
        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println("20 / 4 = " + calculate(20, '/', 4));

    }
}
