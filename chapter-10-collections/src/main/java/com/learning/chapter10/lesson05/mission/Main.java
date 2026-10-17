package com.learning.chapter10.lesson05.mission;

/**
 * [Chapter 10. Collection]
 * 05. HashSet - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/496
 */

import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Set<String> visited = new HashSet<>();
        visited.add("초원");
        visited.add("사막");
        visited.add("초원");
        visited.add("동굴");

        System.out.println("방문한 지역 수: " + visited.size());
        System.out.println("사막 방문 여부: " + visited.contains("사막"));

    }
}
