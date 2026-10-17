package com.learning.chapter11.lesson02.example;

/**
 * [Chapter 11. 문자열]
 * 02. 문자열 비교와 equals - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/503
 */

public class Main {

    public static void main(String[] args) {

        String a = new String("검");
        String b = "검";

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
