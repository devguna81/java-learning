package com.learning.chapter02.lesson10.mission;

/**
 * [Chapter 02. 변수]
 * 10. 실습 - 게임 캐릭터 정보 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/419
 */

public class Main {

    public static void main(String[] args) {

        final int MAX_HP = 150;

        String characterName = "Alex";
        char rank = 'S';
        int level = 30;
        int currentHp = 120;
        double criticalChance = 0.4;
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
