package com.learning.chapter11.lesson06.mission;

/**
 * [Chapter 11. 문자열]
 * 06. replace - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/507
 */

public class Main {

    public static void main(String[] args) {

        String template = "{name}님, 환영합니다";
        String result = template.replace("{name}", "전사");

        System.out.println(result);

    }
}
