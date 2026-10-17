package com.learning.chapter02.lesson10.example;

/**
 * [Chapter 02. 변수]
 * 10. 실습 - 게임 캐릭터 정보 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/419
 */

public class Main {

    public static void main(String[] args) {

        final int MAX_HP = 100;

        String characterName = "Steve";
        char rank = 'A';
        int level = 12;
        int currentHp = 78;
        double criticalChance = 0.25;
        boolean isAlive = true;

        System.out.println("=== 캐릭터 정보 ===");
        System.out.println("이름: " + characterName);
        System.out.println("등급: " + rank);
        System.out.println("레벨: " + level);
        System.out.println("체력: " + currentHp + " / " + MAX_HP);
        System.out.println("크리티컬 확률: " + (criticalChance * 100) + "%");
        System.out.println("생존 여부: " + isAlive);

    }
}
