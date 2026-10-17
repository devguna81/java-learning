package com.learning.chapter14.lesson08.example;

/**
 * [Chapter 14. Modern Java]
 * 08. 실습 - 플레이어 점수 순위 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/536
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("전사", 80);
        scores.put("마법사", 95);
        scores.put("궁수", 60);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(scores.entrySet());

        entries.stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + "점"));

    }
}
