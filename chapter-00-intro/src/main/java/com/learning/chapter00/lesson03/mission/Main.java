package com.learning.chapter00.lesson03.mission;

/**
 * [Chapter 00. 개발자가 되어보자]
 * 03. Java는 어떤 언어일까? - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/614
 */

public class Main {

    public static void main(String[] args) {

        String language = "Java";

        System.out.println("제가 배우는 언어는 " + language + "입니다");
        System.out.println("실행 중인 Java 버전: " + System.getProperty("java.version"));
        System.out.println("운영체제: " + System.getProperty("os.name"));

    }
}
