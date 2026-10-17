package com.learning.chapter12.lesson01.example;

/**
 * [Chapter 12. 예외와 오류]
 * 01. 오류는 왜 발생할까? - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/511
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {80, 90, 100};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        int average = sum / scores.length;
        System.out.println("평균 점수: " + average);

    }
}
