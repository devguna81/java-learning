package com.learning.chapter08.lesson06.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 06. this 키워드 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/476
 */

public class Main {

    public static void main(String[] args) {

        Item bow = new Item("활", 250);
        bow.showInfo();

    }
}

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void showInfo() {
        System.out.println(this.name + " - " + this.price + "원");
    }
}
