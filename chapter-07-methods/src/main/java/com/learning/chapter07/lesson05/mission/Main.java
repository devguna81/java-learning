package com.learning.chapter07.lesson05.mission;

/**
 * [Chapter 07. 메서드]
 * 05. 메서드 오버로딩 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/466
 */

public class Main {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        System.out.println("두 수 곱: " + multiply(4, 5));
        System.out.println("세 수 곱: " + multiply(3, 4, 5));

    }
}
