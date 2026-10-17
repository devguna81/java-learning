package com.learning.chapter02.lesson07.mission;

/**
 * [Chapter 02. 변수]
 * 07. String - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/416
 */

public class Main {

    public static void main(String[] args) {

        String inputName = "Alex";
        String correctName = "Alex";

        boolean isMatch = inputName.equals(correctName);

        System.out.println("입력한 이름: " + inputName);
        System.out.println("정답 이름: " + correctName);
        System.out.println("이름이 일치합니다: " + isMatch);

    }
}
