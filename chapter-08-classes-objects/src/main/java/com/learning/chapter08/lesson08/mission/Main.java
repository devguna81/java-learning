package com.learning.chapter08.lesson08.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 08. 객체 배열 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/478
 */

public class Main {

    public static void main(String[] args) {

        Item[] items = new Item[3];
        items[0] = new Item("포션", 100);
        items[1] = new Item("검", 500);
        items[2] = new Item("방패", 300);

        int total = 0;
        for (int i = 0; i < items.length; i++) {
            total = total + items[i].price;
        }

        System.out.println("전체 가격 합계: " + total);

    }
}

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
