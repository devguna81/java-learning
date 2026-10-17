package com.learning.chapter05.lesson09.mission;

/**
 * [Chapter 05. 반복문]
 * 09. 실습 - 몬스터 10마리 공격하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/447
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {

            if (i % 5 == 0) {
                System.out.println(i + "번에서 회복 아이템을 얻었습니다");
                continue;
            }

            if (i == 12) {
                System.out.println(i + "번 보스 몬스터를 처치했습니다! 전투 종료");
                break;
            }

            System.out.println(i + "번 몬스터를 공격합니다");
        }

    }
}
