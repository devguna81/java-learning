package com.learning.chapter12.lesson04.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 04. Logic Error - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/514
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {80, 90, 100};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        int average = sum / scores.length;
        System.out.println("평균: " + average);

    }
}
