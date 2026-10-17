package com.learning.chapter07.lesson04.mission;

/**
 * [Chapter 07. 메서드]
 * 04. 반환값과 return - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/465
 */

public class Main {

    public static int bigger(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        int result = bigger(17, 42);
        System.out.println("더 큰 값: " + result);

    }
}
