package com.learning.chapter12.lesson06.example;

/**
 * [Chapter 12. 예외와 오류]
 * 06. try와 catch - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/516
 */

public class Main {

    public static void main(String[] args) {

        int hp = 100;
        int damage = 0;

        try {
            int result = hp / damage;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다: " + e.getMessage());
        }

        System.out.println("프로그램이 계속 실행됩니다");

    }
}
