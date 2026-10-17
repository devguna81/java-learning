package com.learning.chapter10.lesson02.example;

/**
 * [Chapter 10. Collection]
 * 02. List - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/493
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> inventory = new ArrayList<>();
        inventory.add("검");
        inventory.add("방패");

        System.out.println("아이템 개수: " + inventory.size());
        System.out.println(inventory.get(0));
        System.out.println(inventory.get(1));

    }
}
