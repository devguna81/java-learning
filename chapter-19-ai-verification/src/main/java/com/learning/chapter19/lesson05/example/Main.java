package com.learning.chapter19.lesson05.example;

/**
 * [Chapter 19. AI 코드 검증]
 * 05. 오류 메시지 확인하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/573
 */

public class Main {

    public static void main(String[] args) {

        int hp = 100;
        int damage = 0;

        if (damage != 0) {
            System.out.println(hp / damage);
        } else {
            System.out.println("0으로 나눌 수 없습니다");
        }

    }
}
