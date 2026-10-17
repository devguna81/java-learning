package com.learning.chapter19.lesson06.mission;

/**
 * [Chapter 19. AI 코드 검증]
 * 06. AI 답변 비교하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/574
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(80);
        scores.add(40);
        scores.add(95);

        List<Integer> passed = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= 60) {
                passed.add(scores.get(i));
            }
        }

        System.out.println(passed);

    }
}
