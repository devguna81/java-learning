package com.learning.chapter11.lesson07.example;

/**
 * [Chapter 11. 문자열]
 * 07. split - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/508
 */

public class Main {

    public static void main(String[] args) {

        String command = "공격 좀비";
        String[] parts = command.split(" ");

        System.out.println("동작: " + parts[0]);
        System.out.println("대상: " + parts[1]);

    }
}
