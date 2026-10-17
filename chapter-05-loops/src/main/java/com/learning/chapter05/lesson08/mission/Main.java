package com.learning.chapter05.lesson08.mission;

/**
 * [Chapter 05. 반복문]
 * 08. 무한 반복 이해하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/446
 */

public class Main {

    public static void main(String[] args) {

        int count = 0;

        while (true) {
            if (count == 5) {
                System.out.println("목표 달성!");
                break;
            }
            System.out.println(count);
            count++;
        }

    }
}
