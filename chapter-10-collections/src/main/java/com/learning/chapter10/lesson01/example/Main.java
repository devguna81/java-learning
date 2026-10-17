package com.learning.chapter10.lesson01.example;

/**
 * [Chapter 10. Collection]
 * 01. 배열의 한계 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/492
 */

public class Main {

    public static void main(String[] args) {

        String[] inventory = {"검", "방패", "물약"};
        System.out.println("아이템 개수: " + inventory.length);

        String[] bigger = java.util.Arrays.copyOf(inventory, inventory.length + 1);
        bigger[inventory.length] = "활";
        inventory = bigger;

        for (int i = 0; i < inventory.length; i++) {
            System.out.println(inventory[i]);
        }

    }
}
