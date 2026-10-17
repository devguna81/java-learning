package com.learning.chapter01.lesson07.mission;

/**
 * [Chapter 01. Java와 친해지기]
 * 07. 실습 - 자기소개 프로그램 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/409
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("=== 캐릭터 정보 ===");

        // 이름 출력
        String name = "Alex";
        System.out.println("이름: " + name);

        // 레벨과 체력 출력
        int level = 5;
        int hp = 35;
        System.out.println("레벨: " + level);
        System.out.println("체력: " + hp);

        // 한 줄 소개 출력
        System.out.println("한 줄 소개: 언제나 앞장서서 몬스터와 맞서는 전사");

    }
}
