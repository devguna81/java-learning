package com.learning.chapter13.lesson01.mission;

/**
 * [Chapter 13. 파일 처리]
 * 01. 파일이 필요한 이유 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/521
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("포션", 5);
        inventory.put("화살", 20);

        System.out.println("포션 개수: " + inventory.get("포션"));
        System.out.println("화살 개수: " + inventory.get("화살"));

    }
}
