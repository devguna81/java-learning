package com.learning.chapter10.lesson06.example;

/**
 * [Chapter 10. Collection]
 * 06. Map - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/497
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> itemCount = new HashMap<>();
        itemCount.put("포션", 3);
        itemCount.put("화살", 20);

        System.out.println("포션 개수: " + itemCount.get("포션"));
        System.out.println("화살 개수: " + itemCount.get("화살"));

    }
}
