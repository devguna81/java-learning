package com.learning.chapter04.lesson05.mission;

/**
 * [Chapter 04. 조건문]
 * 05. 여러 조건 연결하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/433
 */

public class Main {

    public static void main(String[] args) {

        int level = 30;
        int mana = 50;

        System.out.println("레벨: " + level + ", 마나: " + mana);

        if (level >= 25 && mana >= 40) {
            System.out.println("스킬을 사용할 수 있습니다");
        } else {
            System.out.println("조건이 부족합니다");
        }

    }
}
