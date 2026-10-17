package com.learning.chapter12.lesson06.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 06. try와 catch - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/516
 */

public class Main {

    public static void main(String[] args) {

        int[] items = {10, 20, 30};

        try {
            System.out.println(items[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어났습니다: " + e.getMessage());
        }

        System.out.println("프로그램이 계속 실행됩니다");

    }
}
