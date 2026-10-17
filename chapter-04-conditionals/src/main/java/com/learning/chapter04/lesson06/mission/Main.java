package com.learning.chapter04.lesson06.mission;

/**
 * [Chapter 04. 조건문]
 * 06. 중첩 조건문 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/434
 */

public class Main {

    public static void main(String[] args) {

        int emptySlots = 2;
        int itemWeight = 15;

        System.out.println("빈 슬롯: " + emptySlots + ", 아이템 무게: " + itemWeight);

        if (emptySlots >= 1) {
            if (itemWeight <= 20) {
                System.out.println("아이템을 획득했습니다");
            } else {
                System.out.println("너무 무겁습니다");
            }
        } else {
            System.out.println("인벤토리가 가득 찼습니다");
        }

    }
}
