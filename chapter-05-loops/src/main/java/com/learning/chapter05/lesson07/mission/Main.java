package com.learning.chapter05.lesson07.mission;

/**
 * [Chapter 05. 반복문]
 * 07. 중첩 반복문 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/445
 */

public class Main {

    public static void main(String[] args) {

        for (int dan = 2; dan <= 3; dan++) {
            System.out.println(dan + "단");
            for (int i = 1; i <= 3; i++) {
                System.out.println(dan + " x " + i + " = " + (dan * i));
            }
        }

    }
}
