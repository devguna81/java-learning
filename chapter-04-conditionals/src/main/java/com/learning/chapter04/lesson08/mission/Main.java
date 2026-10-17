package com.learning.chapter04.lesson08.mission;

/**
 * [Chapter 04. 조건문]
 * 08. switch expression - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/436
 */

public class Main {

    public static void main(String[] args) {

        int seasonNumber = 2;
        System.out.println("계절 번호: " + seasonNumber);

        String season = switch (seasonNumber) {
            case 1 -> "봄입니다";
            case 2 -> "여름입니다";
            case 3 -> "가을입니다";
            case 4 -> "겨울입니다";
            default -> "알 수 없는 계절입니다";
        };

        System.out.println(season);

    }
}
