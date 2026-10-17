package com.learning.chapter12.lesson04.example;

/**
 * [Chapter 12. 예외와 오류]
 * 04. Logic Error - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/514
 */

public class Main {

    public static void main(String[] args) {

        int hp = 30;
        boolean isDanger = hp > 50;

        System.out.println("위험 상태: " + isDanger);

    }
}
