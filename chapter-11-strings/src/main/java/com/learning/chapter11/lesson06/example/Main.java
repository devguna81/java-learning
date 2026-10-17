package com.learning.chapter11.lesson06.example;

/**
 * [Chapter 11. 문자열]
 * 06. replace - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/507
 */

public class Main {

    public static void main(String[] args) {

        String message = "체력이 0입니다";
        String updated = message.replace("0", "50");

        System.out.println(message);
        System.out.println(updated);

    }
}
