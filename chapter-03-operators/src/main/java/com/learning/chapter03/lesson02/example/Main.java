package com.learning.chapter03.lesson02.example;

/**
 * [Chapter 03. 연산자]
 * 02. 덧셈, 뺄셈, 곱셈, 나눗셈 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/421
 */

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + ".0 / " + b + " = " + ((double) a / b));

    }
}
