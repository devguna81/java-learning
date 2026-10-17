package com.learning.chapter05.lesson09.example;

/**
 * [Chapter 05. 반복문]
 * 09. 실습 - 몬스터 10마리 공격하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/447
 */

public class Main {

    public static void main(String[] args) {

        int bossNumber = 5;

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println(i + "번 몬스터는 이미 도망쳤습니다");
                continue;
            }

            if (i == bossNumber) {
                System.out.println(i + "번 보스 몬스터를 처치했습니다! 전투 종료");
                break;
            }

            System.out.println(i + "번 몬스터를 공격합니다");
        }

        System.out.println("전투가 마무리되었습니다");

    }
}
