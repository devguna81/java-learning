package com.learning.chapter05.lesson05.example;

/**
 * [Chapter 05. 반복문]
 * 05. break - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/443
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                System.out.println("보스 몬스터 발견! 탐색 중단");
                break;
            }
            System.out.println(i + "번째 몬스터 확인");
        }

        System.out.println("탐색이 끝났습니다");

    }
}
