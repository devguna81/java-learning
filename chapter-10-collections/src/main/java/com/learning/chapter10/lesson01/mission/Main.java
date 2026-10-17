package com.learning.chapter10.lesson01.mission;

/**
 * [Chapter 10. Collection]
 * 01. 배열의 한계 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/492
 */

public class Main {

    public static void main(String[] args) {

        String[] items = {"검", "방패"};
        String[] bigger = java.util.Arrays.copyOf(items, items.length + 1);
        bigger[items.length] = "지팡이";
        items = bigger;

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }

    }
}
