package com.learning.chapter05.lesson08.example;

/**
 * [Chapter 05. 반복문]
 * 08. 무한 반복 이해하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/446
 */

public class Main {

    public static void main(String[] args) {

        int hp = 100;
        int turn = 0;

        while (true) {
            turn++;
            hp = hp - 30;
            System.out.println(turn + "턴: 남은 HP " + hp);

            if (hp <= 0) {
                System.out.println("몬스터를 처치했습니다");
                break;
            }
        }

        System.out.println("총 " + turn + "턴 만에 승리했습니다");

    }
}
