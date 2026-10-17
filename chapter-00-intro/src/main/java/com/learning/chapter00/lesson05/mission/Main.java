package com.learning.chapter00.lesson05.mission;

/**
 * [Chapter 00. 개발자가 되어보자]
 * 05. JDK, JVM, Java 이해하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/616
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=== 실행 환경 정보 ===");
        System.out.println("Java 버전: " + System.getProperty("java.version"));
        System.out.println("운영체제: " + System.getProperty("os.name"));
        System.out.println("CPU 아키텍처: " + System.getProperty("os.arch"));

    }
}
