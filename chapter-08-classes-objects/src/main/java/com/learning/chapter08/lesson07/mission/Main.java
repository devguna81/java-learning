package com.learning.chapter08.lesson07.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 07. 여러 객체 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/477
 */

public class Main {

    public static void main(String[] args) {

        Item potion = new Item("포션", 100);
        Item elixir = new Item("엘릭서", 500);
        Item bread = new Item("빵", 50);

        elixir.price = 400;

        potion.showInfo();
        elixir.showInfo();
        bread.showInfo();

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
        System.out.println(name + " - " + price + "원");
    }
}
