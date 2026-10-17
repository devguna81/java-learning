package com.learning.chapter12.lesson03.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 03. Runtime Error - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/513
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {10, 20, 30};
        int index = 3;

        if (index < scores.length) {
            System.out.println(scores[index]);
        } else {
            System.out.println("인덱스 " + index + "은(는) 유효하지 않습니다");
        }

    }
}
