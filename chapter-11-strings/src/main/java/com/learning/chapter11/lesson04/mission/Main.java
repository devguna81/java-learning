package com.learning.chapter11.lesson04.mission;

/**
 * [Chapter 11. 문자열]
 * 04. contains - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/505
 */

public class Main {

    public static void main(String[] args) {

        String chat = "너는 정말 바보 같아";

        if (chat.contains("바보")) {
            System.out.println("부적절한 표현이 감지되었습니다");
        } else {
            System.out.println("정상 메시지입니다");
        }

    }
}
