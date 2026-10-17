package com.learning.chapter02.lesson05.mission;

/**
 * [Chapter 02. 변수]
 * 05. boolean - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/414
 */

public class Main {

    public static void main(String[] args) {

        int hp = 8;
        boolean isDanger = (hp <= 10);

        int level = 30;
        boolean canLevelUp = (level >= 99);

        System.out.println("체력: " + hp);
        System.out.println("위험 상태 여부: " + isDanger);
        System.out.println("레벨: " + level);
        System.out.println("레벨업 가능 여부: " + canLevelUp);

    }
}
