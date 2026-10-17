package com.learning.chapter07.lesson04.example;

/**
 * [Chapter 07. 메서드]
 * 04. 반환값과 return - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/465
 */

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(3, 5);
        System.out.println("3 + 5 = " + result);

        System.out.println("10 + 20 = " + add(10, 20));

    }
}
