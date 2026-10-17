package com.learning.chapter07.lesson07.mission;

/**
 * [Chapter 07. 메서드]
 * 07. 재귀 메서드 맛보기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/468
 */

public class Main {

    public static void countDown(int n) {
        if (n == 0) {
            System.out.println("발사!");
            return;
        }
        System.out.println(n);
        countDown(n - 1);
    }

    public static void main(String[] args) {

        countDown(4);

    }
}
