package com.learning.chapter11.lesson02.mission;

/**
 * [Chapter 11. 문자열]
 * 02. 문자열 비교와 equals - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/503
 */

public class Main {

    public static void main(String[] args) {

        String command = "공격";

        if ("공격".equals(command)) {
            System.out.println("공격을 시작합니다");
        } else {
            System.out.println("알 수 없는 명령어입니다");
        }

    }
}
