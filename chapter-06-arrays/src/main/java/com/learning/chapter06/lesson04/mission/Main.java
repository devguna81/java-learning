package com.learning.chapter06.lesson04.mission;

/**
 * [Chapter 06. 배열]
 * 04. 배열과 for문 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/456
 */

public class Main {

    public static void main(String[] args) {

        int[] numbers = {12, 45, 8, 23, 30};

        int evenSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenSum = evenSum + numbers[i];
            }
        }

        System.out.println("짝수 합계: " + evenSum);

    }
}
