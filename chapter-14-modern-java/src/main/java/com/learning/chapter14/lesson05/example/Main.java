package com.learning.chapter14.lesson05.example;

/**
 * [Chapter 14. Modern Java]
 * 05. Optional - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/533
 */

import java.util.Optional;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("전사", 100);

        Optional<Integer> warriorScore = Optional.ofNullable(scores.get("전사"));
        Optional<Integer> mageScore = Optional.ofNullable(scores.get("마법사"));

        System.out.println("전사 점수: " + warriorScore.orElse(0));
        System.out.println("마법사 점수: " + mageScore.orElse(0));

    }
}
