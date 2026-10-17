package com.learning.chapter10.lesson03.example;

/**
 * [Chapter 10. Collection]
 * 03. ArrayList - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/494
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> inventory = new ArrayList<>();
        inventory.add("검");
        inventory.add("방패");
        inventory.add("물약");

        inventory.remove("방패");

        System.out.println("방패 보유 여부: " + inventory.contains("방패"));
        System.out.println("아이템 개수: " + inventory.size());
        System.out.println(inventory.get(0) + ", " + inventory.get(1));

    }
}
