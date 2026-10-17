package com.learning.chapter07.lesson02.example;

/**
 * [Chapter 07. 메서드]
 * 02. 메서드 선언과 호출 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/463
 */

public class Main {

    public static void attack() {
        System.out.println("공격!");
    }

    public static void main(String[] args) {

        System.out.println("==== 공격 시작 ====");
        attack();
        attack();
        attack();
        System.out.println("==== 공격 종료 ====");

    }
}
