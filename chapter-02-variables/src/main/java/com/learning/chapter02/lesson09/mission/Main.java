package com.learning.chapter02.lesson09.mission;

/**
 * [Chapter 02. 변수]
 * 09. final - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/418
 */

public class Main {

    public static void main(String[] args) {

        final int MAX_INVENTORY_SLOTS = 20;
        int usedSlots = 5;

        System.out.println("최대 인벤토리 슬롯: " + MAX_INVENTORY_SLOTS);
        System.out.println("현재 사용 중인 슬롯: " + usedSlots);

    }
}
