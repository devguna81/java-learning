package com.learning.chapter05.lesson10.example;

/**
 * [Chapter 05. 반복문]
 * 10. 도전 - 구구단 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/448
 */

public class Main {

    public static void main(String[] args) {

        for (int dan = 2; dan <= 9; dan++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }

    }
}
