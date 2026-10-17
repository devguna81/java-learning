package com.learning.chapter11.lesson07.mission;

/**
 * [Chapter 11. 문자열]
 * 07. split - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/508
 */

public class Main {

    public static void main(String[] args) {

        String command = "사용 물약";
        String[] parts = command.split(" ");

        System.out.println("동작: " + parts[0]);
        System.out.println("대상: " + parts[1]);

    }
}
