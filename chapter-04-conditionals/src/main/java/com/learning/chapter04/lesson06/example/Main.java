package com.learning.chapter04.lesson06.example;

/**
 * [Chapter 04. 조건문]
 * 06. 중첩 조건문 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/434
 */

public class Main {

    public static void main(String[] args) {

        int level = 25;
        int gold = 50;

        if (level >= 20) {
            if (gold >= 100) {
                System.out.println("특별 상점에 입장합니다");
            } else {
                System.out.println("입장 불가: 골드가 부족합니다");
            }
        } else {
            System.out.println("입장 불가: 레벨이 부족합니다");
        }

    }
}
