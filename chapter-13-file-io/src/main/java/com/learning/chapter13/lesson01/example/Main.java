package com.learning.chapter13.lesson01.example;

/**
 * [Chapter 13. 파일 처리]
 * 01. 파일이 필요한 이유 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/521
 */

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();
        scores.put("전사", 100);
        scores.put("마법사", 80);

        System.out.println("전사 점수: " + scores.get("전사"));
        System.out.println("마법사 점수: " + scores.get("마법사"));

    }
}
