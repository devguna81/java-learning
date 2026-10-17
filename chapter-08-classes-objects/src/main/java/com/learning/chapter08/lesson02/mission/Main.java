package com.learning.chapter08.lesson02.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 02. 클래스 선언과 객체 생성 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/472
 */

public class Main {

    public static void main(String[] args) {

        Item potion = new Item();
        potion.name = "포션";
        potion.price = 100;

        System.out.println(potion.name + " - " + potion.price + "원");

    }
}

class Item {
    String name;
    int price;
}
