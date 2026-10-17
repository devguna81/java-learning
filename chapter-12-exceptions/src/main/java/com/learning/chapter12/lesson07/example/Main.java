package com.learning.chapter12.lesson07.example;

/**
 * [Chapter 12. 예외와 오류]
 * 07. finally - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/517
 */

public class Main {

    public static void main(String[] args) {

        int hp = 100;
        int damage = 0;

        try {
            int result = hp / damage;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        } finally {
            System.out.println("전투 처리를 종료합니다");
        }

    }
}
