package com.learning.chapter10.lesson03.mission;

/**
 * [Chapter 10. Collection]
 * 03. ArrayList - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/494
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> inventory = new ArrayList<>();
        inventory.add("포션");
        inventory.add("엘릭서");
        inventory.add("붕대");

        inventory.remove("엘릭서");

        System.out.println("엘릭서 보유 여부: " + inventory.contains("엘릭서"));
        System.out.println("아이템 개수: " + inventory.size());
        System.out.println(inventory.get(0) + ", " + inventory.get(1));

    }
}
