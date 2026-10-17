package com.learning.chapter02.lesson04.mission;

/**
 * [Chapter 02. 변수]
 * 04. double - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/413
 */

public class Main {

    public static void main(String[] args) {

        int baseAttack = 20;
        double criticalMultiplier = 1.8;

        double criticalDamage = baseAttack * criticalMultiplier;

        System.out.println("기본 공격력: " + baseAttack);
        System.out.println("크리티컬 배율: " + criticalMultiplier);
        System.out.println("크리티컬 데미지: " + criticalDamage);

    }
}
