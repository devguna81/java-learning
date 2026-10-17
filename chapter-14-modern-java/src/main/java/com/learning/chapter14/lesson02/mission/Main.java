package com.learning.chapter14.lesson02.mission;

/**
 * [Chapter 14. Modern Java]
 * 02. Record - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/530
 */

public class Main {

    public static void main(String[] args) {

        Item item = new Item("포션", 50);
        System.out.println(item.name() + ": " + item.price() + "골드");
        System.out.println(item);

    }
}

final class Item {
    private final String name;
    private final int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String name() {
        return name;
    }

    int price() {
        return price;
    }

    @Override
    public String toString() {
        return "Item[name=" + name + ", price=" + price + "]";
    }
}
