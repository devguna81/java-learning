package com.learning.chapter06.lesson03.mission;

/**
 * [Chapter 06. 배열]
 * 03. 배열 초기화 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/455
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {85, 92, 78, 60};
        scores[3] = 100;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

    }
}
