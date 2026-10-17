package com.learning.chapter12.lesson01.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 01. 오류는 왜 발생할까? - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/511
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {70, 80, 90, 60};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        int average = sum / scores.length;
        System.out.println("평균 점수: " + average);

    }
}
