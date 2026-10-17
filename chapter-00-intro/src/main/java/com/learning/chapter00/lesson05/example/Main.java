package com.learning.chapter00.lesson05.example;

/**
 * [Chapter 00. 개발자가 되어보자]
 * 05. JDK, JVM, Java 이해하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/616
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Java 버전: " + System.getProperty("java.version"));
        System.out.println("실행 환경(JVM) 이름: " + System.getProperty("java.vm.name"));
        System.out.println("표준 라이브러리 공급자: " + System.getProperty("java.vendor"));

    }
}
