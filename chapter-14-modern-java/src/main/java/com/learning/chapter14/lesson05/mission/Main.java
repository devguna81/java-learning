package com.learning.chapter14.lesson05.mission;

/**
 * [Chapter 14. Modern Java]
 * 05. Optional - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/533
 */

import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("포션", 5);

        Optional<Integer> potionCount = Optional.ofNullable(inventory.get("포션"));
        Optional<Integer> elixirCount = Optional.ofNullable(inventory.get("엘릭서"));

        System.out.println("포션 개수: " + potionCount.orElse(0));
        System.out.println("엘릭서 개수: " + elixirCount.orElse(0));

    }
}
