package com.learning.chapter02.lesson08.mission;

/**
 * [Chapter 02. 변수]
 * 08. 변수 값 변경하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/417
 */

public class Main {

    public static void main(String[] args) {

        int score = 0;
        int gold = 50;
        System.out.println("시작 점수: " + score + ", 시작 골드: " + gold);

        score += 100;
        gold += 20;
        System.out.println("몬스터 처치! 점수: " + score + ", 골드: " + gold);

        gold *= 2;
        System.out.println("아이템 획득! 점수: " + score + ", 골드: " + gold);

    }
}
