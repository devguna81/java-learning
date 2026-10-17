package com.learning.chapter04.lesson02.example;

/**
 * [Chapter 04. 조건문]
 * 02. if - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/430
 */

public class Main {

    public static void main(String[] args) {

        int hp = 15;
        int maxHp = 100;

        System.out.println("체력: " + hp + "/" + maxHp);

        if (hp < 20) {
            System.out.println("경고: 체력이 낮습니다!");
            System.out.println("회복 아이템을 사용하세요");
        }

        System.out.println("상태 확인 완료");

    }
}
