package com.learning.chapter14.lesson04.example;

/**
 * [Chapter 14. Modern Java]
 * 04. Stream - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/532
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<Integer> scores = new ArrayList<>();
        scores.add(60);
        scores.add(85);
        scores.add(90);
        scores.add(40);

        scores.stream()
            .filter(score -> score >= 60)
            .forEach(score -> System.out.println(score + "점: 합격"));

    }
}
