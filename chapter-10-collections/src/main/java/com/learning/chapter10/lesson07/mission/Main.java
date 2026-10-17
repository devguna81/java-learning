package com.learning.chapter10.lesson07.mission;

/**
 * [Chapter 10. Collection]
 * 07. HashMap - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/498
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> potions = new HashMap<>();
        potions.put("체력물약", 2);

        if (!potions.containsKey("마나물약")) {
            potions.put("마나물약", 1);
        }

        System.out.println("체력물약: " + potions.get("체력물약"));
        System.out.println("마나물약: " + potions.get("마나물약"));

    }
}
