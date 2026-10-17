package com.learning.chapter03.lesson08.mission;

/**
 * [Chapter 03. 연산자]
 * 08. 연산 순서 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/427
 */

public class Main {

    public static void main(String[] args) {

        int attack = 20;
        boolean hasArmorPierce = true;

        boolean isCritical = (attack >= 15 && hasArmorPierce) || (attack >= 30);

        System.out.println("공격력: " + attack + ", 방어 관통: " + hasArmorPierce);
        System.out.println("기본 데미지: " + attack);
        System.out.println("크리티컬 조건 충족: " + isCritical);

    }
}
