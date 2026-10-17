package com.learning.chapter10.lesson10.mission;

/**
 * [Chapter 10. Collection]
 * 10. 실습 - 게임 아이템 인벤토리 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/501
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();

        addItem(inventory, "화살");
        addItem(inventory, "화살");
        addItem(inventory, "화살");
        addItem(inventory, "포션");

        System.out.println("화살 개수: " + inventory.get("화살"));
        System.out.println("포션 개수: " + inventory.get("포션"));

    }

    static void addItem(Map<String, Integer> inventory, String itemName) {
        if (inventory.containsKey(itemName)) {
            int current = inventory.get(itemName);
            inventory.put(itemName, current + 1);
        } else {
            inventory.put(itemName, 1);
        }
    }
}
