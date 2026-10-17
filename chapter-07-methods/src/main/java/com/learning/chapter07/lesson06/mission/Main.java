package com.learning.chapter07.lesson06.mission;

/**
 * [Chapter 07. 메서드]
 * 06. 메서드와 배열 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/467
 */

public class Main {

    public static double average(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return (double) total / numbers.length;
    }

    public static void main(String[] args) {

        int[] scores = {10, 20, 30};
        System.out.println("평균: " + average(scores));

    }
}
