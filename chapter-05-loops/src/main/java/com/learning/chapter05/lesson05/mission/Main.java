package com.learning.chapter05.lesson05.mission;

/**
 * [Chapter 05. 반복문]
 * 05. break - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/443
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i > 15) {
                System.out.println("15를 초과했습니다");
                break;
            }
            System.out.println(i);
        }

    }
}
