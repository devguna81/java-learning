package com.learning.chapter12.lesson05.example;

/**
 * [Chapter 12. 예외와 오류]
 * 05. Exception - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/515
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {80, 90, 100};
        int index = 5;

        if (index >= 0 && index < scores.length) {
            System.out.println(scores[index]);
        } else {
            System.out.println("ArrayIndexOutOfBoundsException을 예방했습니다");
        }

    }
}
