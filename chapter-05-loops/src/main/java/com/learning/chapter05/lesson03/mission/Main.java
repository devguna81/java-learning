package com.learning.chapter05.lesson03.mission;

/**
 * [Chapter 05. 반복문]
 * 03. while - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/441
 */

public class Main {

    public static void main(String[] args) {

        int count = 5;

        while (count > 0) {
            System.out.println(count);
            count = count - 1;
        }

        System.out.println("발사!");

    }
}
