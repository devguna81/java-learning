package com.learning.chapter04.lesson01.mission;

/**
 * [Chapter 04. 조건문]
 * 01. 조건문이 필요한 이유 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/429
 */

public class Main {

    public static void main(String[] args) {

        int gold = 150;
        int itemPrice = 100;

        System.out.println("보유 골드: " + gold);
        System.out.println("구매하려는 아이템 가격: " + itemPrice);

        if (gold >= itemPrice) {
            System.out.println("구매 가능합니다");
        }

    }
}
