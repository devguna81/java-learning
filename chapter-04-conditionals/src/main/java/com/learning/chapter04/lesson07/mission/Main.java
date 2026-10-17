package com.learning.chapter04.lesson07.mission;

/**
 * [Chapter 04. 조건문]
 * 07. switch - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/435
 */

public class Main {

    public static void main(String[] args) {

        int dayNumber = 3;
        System.out.println("요일 번호: " + dayNumber);

        switch (dayNumber) {
            case 1:
                System.out.println("월요일입니다");
                break;
            case 2:
                System.out.println("화요일입니다");
                break;
            case 3:
                System.out.println("수요일입니다");
                break;
            default:
                System.out.println("알 수 없는 요일입니다");
        }

    }
}
