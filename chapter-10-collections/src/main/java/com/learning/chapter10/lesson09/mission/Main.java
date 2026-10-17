package com.learning.chapter10.lesson09.mission;

/**
 * [Chapter 10. Collection]
 * 09. Collection 반복 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/500
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> quests = new ArrayList<>();
        quests.add("늑대 사냥");
        quests.add("보물 찾기");
        quests.add("마을 지키기");

        for (String quest : quests) {
            System.out.println("- " + quest);
        }

    }
}
