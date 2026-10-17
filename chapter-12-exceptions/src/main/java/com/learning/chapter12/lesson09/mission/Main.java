package com.learning.chapter12.lesson09.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 09. Stack Trace 읽기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/519
 */

public class Main {

    public static void main(String[] args) {

        int[] items = {1, 2, 3};

        try {
            int value = items[10];
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("예외 종류: " + e.getClass().getSimpleName());
            System.out.println("메시지: " + e.getMessage());
        }

    }
}
