package com.learning.chapter07.lesson07.example;

/**
 * [Chapter 07. 메서드]
 * 07. 재귀 메서드 맛보기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/468
 */

public class Main {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        System.out.println("1부터 5까지 합: " + sum(5));
        System.out.println("1부터 10까지 합: " + sum(10));

    }
}
