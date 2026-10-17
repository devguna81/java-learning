package com.learning.chapter07.lesson03.mission;

/**
 * [Chapter 07. 메서드]
 * 03. 매개변수 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/464
 */

public class Main {

    public static void introduce(String name, int age) {
        System.out.println(name + "님은 " + age + "살입니다");
    }

    public static void main(String[] args) {

        introduce("철수", 20);
        introduce("영희", 22);

    }
}
