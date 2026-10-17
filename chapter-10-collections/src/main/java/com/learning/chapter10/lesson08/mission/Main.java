package com.learning.chapter10.lesson08.mission;

/**
 * [Chapter 10. Collection]
 * 08. 데이터 추가와 삭제 - 실습 미션 모범 답안
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

        List<String> quest = new ArrayList<>();
        quest.add("늑대 사냥");
        quest.add("보물 찾기");
        quest.remove("늑대 사냥");
        System.out.println("남은 퀘스트 수: " + quest.size());

        Set<String> skills = new HashSet<>();
        skills.add("파이어볼");
        skills.add("파이어볼");
        System.out.println("배운 스킬 수: " + skills.size());

        Map<String, Integer> stats = new HashMap<>();
        stats.put("힘", 10);
        System.out.println("민첩 스탯: " + stats.get("민첩"));

    }
}
