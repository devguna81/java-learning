package com.learning.chapter00.lesson03.example;

/**
 * [Chapter 00. 개발자가 되어보자]
 * 03. Java는 어떤 언어일까? - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/614
 */

public class Main {

    public static void main(String[] args) {

        String language = "Java";
        int birthYear = 1995;

        System.out.println(language + "는 " + birthYear + "년에 처음 공개되었습니다");
        System.out.println("실행 중인 Java 버전: " + System.getProperty("java.version"));

    }
}
