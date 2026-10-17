package com.learning.chapter11.lesson03.mission;

/**
 * [Chapter 11. 문자열]
 * 03. 문자열 길이 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/504
 */

public class Main {

    public static void main(String[] args) {

        String nickname = "대마법사";

        if (nickname.length() <= 10) {
            System.out.println("사용 가능한 닉네임입니다");
        } else {
            System.out.println("닉네임이 너무 깁니다");
        }

    }
}
