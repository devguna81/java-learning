package com.learning.chapter07.lesson05.example;

/**
 * [Chapter 07. 메서드]
 * 05. 메서드 오버로딩 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/466
 */

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        System.out.println("두 수 합: " + add(3, 5));
        System.out.println("세 수 합: " + add(3, 5, 7));

    }
}
