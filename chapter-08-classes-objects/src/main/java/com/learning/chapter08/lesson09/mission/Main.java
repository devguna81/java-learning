package com.learning.chapter08.lesson09.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 09. 실습 - 캐릭터 클래스 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/479
 */

public class Main {

    public static void main(String[] args) {

        Item potion = new Item("포션", 3);
        potion.showInfo();

        potion.addQuantity(5);
        potion.showInfo();

    }
}

class Item {
    String name;
    int quantity;

    Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    void addQuantity(int amount) {
        quantity = quantity + amount;
    }

    void showInfo() {
        System.out.println(name + " x " + quantity);
    }
}
