package com.learning.chapter03.lesson05.mission;

/**
 * [Chapter 03. 연산자]
 * 05. 비교 연산자 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/424
 */

public class Main {

    public static void main(String[] args) {

        int level = 25;

        boolean isBeginner = (level <= 10);
        boolean isIntermediate = (level == 25);
        boolean isMaxLevel = (level >= 99);

        System.out.println("레벨: " + level);
        System.out.println("초보자인가(레벨 10 이하)? " + isBeginner);
        System.out.println("중급자인가(정확히 25)? " + isIntermediate);
        System.out.println("최고 레벨인가(99 이상)? " + isMaxLevel);

    }
}
