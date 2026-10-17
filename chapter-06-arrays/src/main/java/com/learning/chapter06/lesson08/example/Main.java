package com.learning.chapter06.lesson08.example;

/**
 * [Chapter 06. 배열]
 * 08. 실습 - 인벤토리 시스템 만들기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/460
 */

public class Main {

    public static void main(String[] args) {

        String[] itemNames = {"물약", "검", "방패", "활"};
        int[] itemCounts = {3, 1, 1, 0};

        for (int i = 0; i < itemNames.length; i++) {
            if (itemCounts[i] == 0) {
                System.out.println(itemNames[i] + ": 보유하지 않음");
                continue;
            }
            System.out.println(itemNames[i] + " x " + itemCounts[i]);
        }

    }
}
