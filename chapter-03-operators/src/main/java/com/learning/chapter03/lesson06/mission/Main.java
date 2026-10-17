package com.learning.chapter03.lesson06.mission;

/**
 * [Chapter 03. 연산자]
 * 06. 논리 연산자 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/425
 */

public class Main {

    public static void main(String[] args) {

        boolean isAlive = true;
        boolean isStunned = false;
        boolean hasWeapon = true;

        boolean canAttack = isAlive && !isStunned && hasWeapon;

        System.out.println("생존 여부: " + isAlive);
        System.out.println("기절 상태: " + isStunned);
        System.out.println("무기 소지: " + hasWeapon);
        System.out.println("공격 가능한가? " + canAttack);

    }
}
