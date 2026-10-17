package com.learning.chapter06.lesson06.mission;

/**
 * [Chapter 06. 배열]
 * 06. 배열 복사 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/458
 */

public class Main {

    public static void main(String[] args) {

        int[] original = {5, 10, 15};
        int[] copy = new int[original.length];
        System.arraycopy(original, 0, copy, 0, original.length);

        copy[0] = 0;

        System.out.print("원본: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        System.out.print("복사본: ");
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
        System.out.println();

    }
}
