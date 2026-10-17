package com.learning.chapter05.lesson06.mission;

/**
 * [Chapter 05. 반복문]
 * 06. continue - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/444
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
