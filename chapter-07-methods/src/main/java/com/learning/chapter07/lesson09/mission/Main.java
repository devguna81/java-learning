package com.learning.chapter07.lesson09.mission;

/**
 * [Chapter 07. 메서드]
 * 09. 도전 - 전투 시스템 메서드로 리팩토링 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/470
 */

public class Main {

    public static int countDefeated(int[] hp) {
        int count = 0;
        for (int i = 0; i < hp.length; i++) {
            if (hp[i] <= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] hp = {0, 20, -5, 30, 0};
        System.out.println("처치된 몬스터 수: " + countDefeated(hp));

    }
}
