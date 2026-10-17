package com.learning.chapter02.lesson09.example;

/**
 * [Chapter 02. 변수]
 * 09. final - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/418
 */

public class Main {

    public static void main(String[] args) {

        final int MAX_HP = 100;
        int currentHp = 80;

        System.out.println("최대 체력: " + MAX_HP);
        System.out.println("현재 체력: " + currentHp);

        currentHp = currentHp + 30;
        if (currentHp > MAX_HP) {
            currentHp = MAX_HP;
        }
        System.out.println("회복 후 체력(최대치 제한): " + currentHp);

    }
}
