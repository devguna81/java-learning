package com.learning.chapter04.lesson05.example;

/**
 * [Chapter 04. 조건문]
 * 05. 여러 조건 연결하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/433
 */

public class Main {

    public static void main(String[] args) {

        int level = 25;
        int gold = 150;

        if (level >= 20 && gold >= 100) {
            System.out.println("던전에 입장합니다");
        } else {
            System.out.println("조건을 만족하지 못했습니다");
        }

        boolean hasKey = false;
        boolean hasPassword = true;

        if (hasKey || hasPassword) {
            System.out.println("문을 열 수 있습니다");
        } else {
            System.out.println("문을 열 방법이 없습니다");
        }

    }
}
