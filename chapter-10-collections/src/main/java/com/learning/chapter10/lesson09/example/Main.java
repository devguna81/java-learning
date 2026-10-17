package com.learning.chapter10.lesson09.example;

/**
 * [Chapter 10. Collection]
 * 09. Collection 반복 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/500
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        List<String> inventory = new ArrayList<>();
        inventory.add("검");
        inventory.add("방패");
        inventory.add("물약");

        for (String item : inventory) {
            System.out.println(item);
        }

        Map<String, Integer> itemCount = new HashMap<>();
        itemCount.put("포션", 3);

        for (String key : itemCount.keySet()) {
            System.out.println(key + ": " + itemCount.get(key));
        }

    }
}
