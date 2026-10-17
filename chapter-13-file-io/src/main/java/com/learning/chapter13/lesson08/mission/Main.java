package com.learning.chapter13.lesson08.mission;

/**
 * [Chapter 13. 파일 처리]
 * 08. 실습 - 게임 점수 저장 프로그램 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/528
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("포션", 5);
        inventory.put("화살", 20);

        saveScores(inventory, "inventory.csv");

        Map<String, Integer> loaded = loadScores("inventory.csv");
        System.out.println("포션 개수: " + loaded.get("포션"));
        System.out.println("화살 개수: " + loaded.get("화살"));

    }

    static void saveScores(Map<String, Integer> scores, String fileName) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            sb.append(entry.getKey()).append(",").append(entry.getValue()).append("\n");
        }
        Files.writeString(Path.of(fileName), sb.toString());
    }

    static Map<String, Integer> loadScores(String fileName) throws IOException {
        Map<String, Integer> result = new HashMap<>();
        String content = Files.readString(Path.of(fileName));
        String[] lines = content.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] fields = lines[i].split(",");
            result.put(fields[0], Integer.parseInt(fields[1]));
        }
        return result;
    }
}
