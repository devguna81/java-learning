package com.learning.chapter04.lesson04.mission;

/**
 * [Chapter 04. 조건문]
 * 04. else if - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/432
 */

public class Main {

    public static void main(String[] args) {

        int hp = 35;

        System.out.println("체력: " + hp);

        if (hp <= 0) {
            System.out.println("상태: 사망");
        } else if (hp <= 20) {
            System.out.println("상태: 위험");
        } else if (hp <= 50) {
            System.out.println("상태: 주의");
        } else {
            System.out.println("상태: 정상");
        }

    }
}
