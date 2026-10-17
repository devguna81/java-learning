package com.learning.chapter10.lesson08.example;

/**
 * [Chapter 10. Collection]
 * 08. 데이터 추가와 삭제 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/499
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        List<String> inventory = new ArrayList<>();
        inventory.add("검");
        inventory.remove("검");
        System.out.println("인벤토리 개수: " + inventory.size());

        Set<String> visited = new HashSet<>();
        visited.add("초원");
        visited.add("초원");
        System.out.println("방문 지역 수: " + visited.size());

        Map<String, Integer> gold = new HashMap<>();
        gold.put("주인공", 100);
        gold.remove("주인공");
        System.out.println("주인공 골드 정보 존재 여부: " + gold.containsKey("주인공"));

    }
}
