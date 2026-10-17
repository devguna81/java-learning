package com.learning.chapter05.lesson04.mission;

/**
 * [Chapter 05. 반복문]
 * 04. do-while - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/442
 */

public class Main {

    public static void main(String[] args) {

        int count = 10;

        do {
            System.out.println("환영합니다! (" + count + "번째)");
            count = count + 1;
        } while (count <= 3);

    }
}
