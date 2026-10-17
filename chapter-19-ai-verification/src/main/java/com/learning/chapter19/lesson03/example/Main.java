package com.learning.chapter19.lesson03.example;

/**
 * [Chapter 19. AI 코드 검증]
 * 03. 코드 한 줄씩 이해하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/571
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(50);
        scores.add(70);
        scores.add(90);

        long count = scores.stream()
            .filter(score -> score >= 60)
            .count();

        System.out.println("60점 이상 개수: " + count);

    }
}
