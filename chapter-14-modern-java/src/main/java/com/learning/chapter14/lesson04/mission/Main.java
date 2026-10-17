package com.learning.chapter14.lesson04.mission;

/**
 * [Chapter 14. Modern Java]
 * 04. Stream - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/532
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(50);
        scores.add(70);
        scores.add(30);

        scores.stream()
            .filter(score -> score >= 50)
            .forEach(score -> System.out.println("합격: " + score));

    }
}
