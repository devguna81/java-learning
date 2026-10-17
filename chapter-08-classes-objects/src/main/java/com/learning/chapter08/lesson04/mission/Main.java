package com.learning.chapter08.lesson04.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 04. 인스턴스 메서드 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/474
 */

public class Main {

    public static void main(String[] args) {

        Item sword = new Item();
        sword.name = "검";
        sword.price = 500;

        sword.showInfo();

    }
}

class Item {
    String name;
    int price;

    void showInfo() {
        System.out.println(name + " - " + price + "원");
    }
}
