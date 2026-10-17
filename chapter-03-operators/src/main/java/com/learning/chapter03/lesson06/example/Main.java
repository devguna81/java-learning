package com.learning.chapter03.lesson06.example;

/**
 * [Chapter 03. 연산자]
 * 06. 논리 연산자 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/425
 */

public class Main {

    public static void main(String[] args) {

        int level = 25;
        int gold = 150;

        boolean canEnter = (level >= 20) && (gold >= 100);
        System.out.println("던전 입장 가능? " + canEnter);

        int hp = 0;
        boolean timeOver = false;
        boolean isGameOver = (hp <= 0) || timeOver;
        System.out.println("게임 오버인가? " + isGameOver);

        boolean isAlive = true;
        System.out.println("죽었는가? " + !isAlive);

    }
}
