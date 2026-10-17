package com.learning.chapter14.lesson01.example;

/**
 * [Chapter 14. Modern Java]
 * 01. var - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/529
 */

public class Main {

    public static void main(String[] args) {

        var name = "전사";
        var hp = 100;
        var items = new java.util.ArrayList<String>();
        items.add("검");

        System.out.println(name + " - HP: " + hp);
        System.out.println(items.get(0));

    }
}
