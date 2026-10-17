package com.learning.chapter11.lesson08.example;

/**
 * [Chapter 11. 문자열]
 * 08. StringBuilder - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/509
 */

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("좀비");
        sb.append(", ");
        sb.append("스켈레톤");
        sb.append(", ");
        sb.append("크리퍼");

        String result = sb.toString();
        System.out.println(result);

    }
}
