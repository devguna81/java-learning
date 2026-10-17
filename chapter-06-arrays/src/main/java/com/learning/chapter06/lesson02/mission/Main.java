package com.learning.chapter06.lesson02.mission;

/**
 * [Chapter 06. 배열]
 * 02. 배열 선언과 생성 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/454
 */

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[6];

        System.out.println("길이: " + numbers.length);
        System.out.println("0번 기본값: " + numbers[0]);
        System.out.println("5번 기본값: " + numbers[5]);

    }
}
