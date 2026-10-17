package com.learning.chapter08.lesson05.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 05. 생성자 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/475
 */

public class Main {

    public static void main(String[] args) {

        Item shield = new Item("방패", 300);
        shield.showInfo();

    }
}

class Item {
    String name;
    int price;

    Item(String initialName, int initialPrice) {
        name = initialName;
        price = initialPrice;
    }

    void showInfo() {
        System.out.println(name + " - " + price + "원");
    }
}
