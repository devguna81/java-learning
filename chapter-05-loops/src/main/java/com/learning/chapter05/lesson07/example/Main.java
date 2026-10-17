package com.learning.chapter05.lesson07.example;

/**
 * [Chapter 05. 반복문]
 * 07. 중첩 반복문 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/445
 */

public class Main {

    public static void main(String[] args) {

        for (int group = 1; group <= 3; group++) {
            System.out.println(group + "번째 무리 등장");
            for (int monster = 1; monster <= 2; monster++) {
                System.out.println("  - " + monster + "번 몬스터 공격");
            }
        }

        System.out.println("모든 무리를 처리했습니다");

    }
}
