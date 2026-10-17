package com.learning.chapter19.lesson01.example;

/**
 * [Chapter 19. AI 코드 검증]
 * 01. AI도 틀릴 수 있다 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/569
 */

public class Main {

    public static void main(String[] args) {

        int number = 4;
        boolean isEven = (number % 2 == 1);

        System.out.println(number + "은(는) 짝수인가요? " + isEven);

    }
}
