package com.learning.chapter04.lesson02.mission;

/**
 * [Chapter 04. 조건문]
 * 02. if - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/430
 */

public class Main {

    public static void main(String[] args) {

        int level = 3;
        System.out.println("레벨: " + level);

        if (level < 5) {
            System.out.println("낮은 레벨입니다");
            System.out.println("튜토리얼을 완료하세요");
        }

        System.out.println("확인 완료");

    }
}
