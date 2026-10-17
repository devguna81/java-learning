package com.learning.chapter03.lesson07.mission;

/**
 * [Chapter 03. 연산자]
 * 07. 문자열 연결 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/426
 */

public class Main {

    public static void main(String[] args) {

        int level = 12;
        int hp = 78;
        int maxHp = 100;
        int attack = 25;

        String summary = "상태 요약: ";
        summary += "[레벨 " + level + "] ";
        summary += "체력 " + hp + "/" + maxHp + ", ";
        summary += "공격력 " + attack;

        System.out.println(summary);

    }
}
