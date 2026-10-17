package com.learning.chapter10.lesson06.mission;

/**
 * [Chapter 10. Collection]
 * 06. Map - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/497
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> resources = new HashMap<>();
        resources.put("골드", 100);
        resources.put("보석", 5);

        System.out.println("골드: " + resources.get("골드"));
        System.out.println("보석: " + resources.get("보석"));

    }
}
