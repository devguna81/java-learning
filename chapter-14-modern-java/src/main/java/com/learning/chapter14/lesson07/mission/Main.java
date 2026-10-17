package com.learning.chapter14.lesson07.mission;

/**
 * [Chapter 14. Modern Java]
 * 07. Pattern Matching - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/535
 */

public class Main {

    public static void main(String[] args) {

        Object value = "안녕하세요";

        if (value instanceof String) {
            String text = (String) value;
            System.out.println("문자열 길이: " + text.length());
        } else {
            System.out.println("문자열이 아닙니다");
        }

    }
}
