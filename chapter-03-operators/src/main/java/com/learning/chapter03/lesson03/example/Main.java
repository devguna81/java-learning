package com.learning.chapter03.lesson03.example;

/**
 * [Chapter 03. 연산자]
 * 03. 나머지 연산자 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/422
 */

public class Main {

    public static void main(String[] args) {

        int totalItems = 10;
        int slotSize = 3;

        int fullSlots = totalItems / slotSize;
        int remainingItems = totalItems % slotSize;

        System.out.println("전체 아이템: " + totalItems);
        System.out.println("가득 찬 슬롯 수: " + fullSlots);
        System.out.println("남은 아이템: " + remainingItems);

        int number = 7;
        System.out.println(number + "은 짝수인가? " + (number % 2 == 0));

    }
}
