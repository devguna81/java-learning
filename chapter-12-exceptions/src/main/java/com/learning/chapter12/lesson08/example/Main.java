package com.learning.chapter12.lesson08.example;

/**
 * [Chapter 12. 예외와 오류]
 * 08. throw - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/518
 */

public class Main {

    public static void main(String[] args) {

        try {
            setLevel(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("레벨 설정 실패: " + e.getMessage());
        }

    }

    static void setLevel(int level) {
        if (level < 0) {
            throw new IllegalArgumentException("레벨은 음수일 수 없습니다");
        }
        System.out.println("레벨: " + level);
    }
}
