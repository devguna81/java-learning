package com.learning.chapter12.lesson03.example;

/**
 * [Chapter 12. 예외와 오류]
 * 03. Runtime Error - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/513
 */

public class Main {

    public static void main(String[] args) {

        int hp = 100;
        int damage = 0;

        if (damage != 0) {
            int result = hp / damage;
            System.out.println(result);
        } else {
            System.out.println("0으로 나눌 수 없습니다");
        }

    }
}
