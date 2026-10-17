package com.learning.chapter05.lesson06.example;

/**
 * [Chapter 05. 반복문]
 * 06. continue - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/444
 */

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("3번째는 건너뜁니다");
                continue;
            }
            System.out.println(i + "번째 몬스터를 공격합니다");
        }

        System.out.println("공격이 끝났습니다");

    }
}
