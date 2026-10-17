package com.learning.chapter14.lesson06.mission;

/**
 * [Chapter 14. Modern Java]
 * 06. switch expression - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/534
 */

public class Main {

    public static void main(String[] args) {

        int dangerLevel = 5;

        String danger = switch (dangerLevel) {
            case 1, 2 -> "낮음";
            case 3, 4, 5 -> "보통";
            default -> {
                String result = "높음";
                yield result;
            }
        };

        System.out.println("위험도: " + danger);

    }
}
