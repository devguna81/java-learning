package com.learning.chapter04.lesson08.example;

/**
 * [Chapter 04. 조건문]
 * 08. switch expression - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/436
 */

public class Main {

    public static void main(String[] args) {

        char rank = 'A';

        String message = switch (rank) {
            case 'S' -> "최고 등급입니다";
            case 'A' -> "상급입니다";
            case 'B' -> "중급입니다";
            default -> "등급 정보가 없습니다";
        };

        System.out.println(message);

    }
}
