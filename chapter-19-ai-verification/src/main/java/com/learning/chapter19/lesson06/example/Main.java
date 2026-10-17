package com.learning.chapter19.lesson06.example;

/**
 * [Chapter 19. AI 코드 검증]
 * 06. AI 답변 비교하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/574
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(50);
        scores.add(70);
        scores.add(90);

        List<Integer> passed = new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) >= 60) {
                passed.add(scores.get(i));
            }
        }

        System.out.println(passed);

    }
}
