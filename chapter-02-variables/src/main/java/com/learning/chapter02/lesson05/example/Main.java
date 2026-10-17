package com.learning.chapter02.lesson05.example;

/**
 * [Chapter 02. 변수]
 * 05. boolean - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/414
 */

public class Main {

    public static void main(String[] args) {

        int hp = 0;
        boolean isDead = (hp <= 0);

        int level = 15;
        boolean isMaxLevel = (level >= 50);

        System.out.println("체력: " + hp);
        System.out.println("사망 여부: " + isDead);
        System.out.println("레벨: " + level);
        System.out.println("최고 레벨 여부: " + isMaxLevel);

    }
}
