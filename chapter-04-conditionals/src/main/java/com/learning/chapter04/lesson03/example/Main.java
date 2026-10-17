package com.learning.chapter04.lesson03.example;

/**
 * [Chapter 04. 조건문]
 * 03. else - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/431
 */

public class Main {

    public static void main(String[] args) {

        int hp = 65;

        System.out.println("현재 체력: " + hp);

        if (hp < 20) {
            System.out.println("경고: 체력이 낮습니다!");
        } else {
            System.out.println("체력이 충분합니다");
        }

    }
}
