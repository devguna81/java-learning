package com.learning.chapter14.lesson06.example;

/**
 * [Chapter 14. Modern Java]
 * 06. switch expression - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/534
 */

public class Main {

    public static void main(String[] args) {

        int level = 7;

        String grade = switch (level) {
            case 1, 2, 3 -> "초급";
            case 4, 5, 6 -> "중급";
            default -> {
                String result = "고급";
                yield result;
            }
        };

        System.out.println("등급: " + grade);

    }
}
