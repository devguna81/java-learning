package com.learning.chapter19.lesson03.mission;

/**
 * [Chapter 19. AI 코드 검증]
 * 03. 코드 한 줄씩 이해하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/571
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(40);
        scores.add(65);
        scores.add(30);

        long count = scores.stream()
            .filter(score -> score >= 60)
            .count();

        System.out.println("합격자 수: " + count);

    }
}
