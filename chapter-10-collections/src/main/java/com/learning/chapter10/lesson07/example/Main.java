package com.learning.chapter10.lesson07.example;

/**
 * [Chapter 10. Collection]
 * 07. HashMap - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/498
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> itemCount = new HashMap<>();
        itemCount.put("포션", 3);

        System.out.println("포션 보유 여부: " + itemCount.containsKey("포션"));
        System.out.println("엘릭서 보유 여부: " + itemCount.containsKey("엘릭서"));
        System.out.println("엘릭서 개수: " + itemCount.get("엘릭서"));

        itemCount.remove("포션");
        System.out.println("포션 보유 여부: " + itemCount.containsKey("포션"));

    }
}
