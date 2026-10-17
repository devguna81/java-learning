package com.learning.chapter03.lesson09.mission;

/**
 * [Chapter 03. 연산자]
 * 09. 실습 - Minecraft 데미지 계산기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/428
 */

public class Main {

    public static void main(String[] args) {

        int baseAttack = 25;
        int defense = 8;
        int rawDamage = baseAttack - defense;

        double firstDamage = rawDamage * 1.0;
        double secondDamage = rawDamage * 1.5;
        double totalDamage = firstDamage + secondDamage;

        System.out.println("1차 공격 데미지: " + firstDamage);
        System.out.println("2차 공격 데미지(크리티컬 X 1.5): " + secondDamage);
        System.out.println("총 피해량: " + totalDamage);

    }
}
