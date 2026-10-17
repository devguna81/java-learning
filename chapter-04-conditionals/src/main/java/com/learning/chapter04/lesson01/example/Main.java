package com.learning.chapter04.lesson01.example;

/**
 * [Chapter 04. 조건문]
 * 01. 조건문이 필요한 이유 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/429
 */

public class Main {

    public static void main(String[] args) {

        int hp = 0;

        System.out.println("현재 체력: " + hp);

        if (hp <= 0) {
            System.out.println("게임 오버");
        }

        System.out.println("프로그램 종료");

    }
}
