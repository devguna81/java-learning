package com.learning.chapter06.lesson08.mission;

/**
 * [Chapter 06. 배열]
 * 08. 실습 - 인벤토리 시스템 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/460
 */

public class Main {

    public static void main(String[] args) {

        String[] names = {"포션", "엘릭서", "빵"};
        int[] counts = {5, 0, 2};

        for (int i = 0; i < names.length; i++) {
            if (counts[i] > 0) {
                System.out.println(names[i] + ": " + counts[i]);
            }
        }

    }
}
