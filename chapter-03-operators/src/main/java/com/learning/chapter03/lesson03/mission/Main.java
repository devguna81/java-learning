package com.learning.chapter03.lesson03.mission;

/**
 * [Chapter 03. 연산자]
 * 03. 나머지 연산자 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/422
 */

public class Main {

    public static void main(String[] args) {

        int number = 15;

        boolean isMultipleOf3 = (number % 3 == 0);
        boolean isMultipleOf5 = (number % 5 == 0);

        System.out.println("숫자: " + number);
        System.out.println("3의 배수인가? " + isMultipleOf3);
        System.out.println("5의 배수인가? " + isMultipleOf5);

    }
}
