package com.learning.chapter12.lesson08.mission;

/**
 * [Chapter 12. 예외와 오류]
 * 08. throw - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/518
 */

public class Main {

    public static void main(String[] args) {

        try {
            setHp(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("HP 설정 실패: " + e.getMessage());
        }

    }

    static void setHp(int hp) {
        if (hp < 0) {
            throw new IllegalArgumentException("HP는 음수일 수 없습니다");
        }
        System.out.println("HP: " + hp);
    }
}
