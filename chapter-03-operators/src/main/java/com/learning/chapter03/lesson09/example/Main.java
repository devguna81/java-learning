package com.learning.chapter03.lesson09.example;

/**
 * [Chapter 03. 연산자]
 * 09. 실습 - Minecraft 데미지 계산기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/428
 */

public class Main {

    public static void main(String[] args) {

        int baseAttack = 25;
        int defense = 8;
        boolean isLuckyHit = true;

        int rawDamage = baseAttack - defense;
        boolean isCritical = isLuckyHit && (baseAttack >= 20);

        double multiplier = isCritical ? 1.5 : 1.0;
        double finalDamage = rawDamage * multiplier;

        System.out.println("기본 공격력: " + baseAttack);
        System.out.println("상대 방어력: " + defense);
        System.out.println("크리티컬 발생: " + isCritical);
        System.out.println("최종 데미지: " + finalDamage);

    }
}
