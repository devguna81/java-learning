package com.learning.chapter12.lesson05.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 05. Exception - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/515
 */

public class Main {

    public static void main(String[] args) {

        int[] items = {10, 20};
        int index = 5;

        if (index >= 0 && index < items.length) {
            System.out.println(items[index]);
        } else {
            System.out.println("ArrayIndexOutOfBoundsException을 예방했습니다");
        }

    }
}
