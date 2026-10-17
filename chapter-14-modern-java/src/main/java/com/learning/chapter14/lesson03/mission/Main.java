package com.learning.chapter14.lesson03.mission;

/**
 * [Chapter 14. Modern Java]
 * 03. Lambda - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/531
 */

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> square = n -> n * n;

        System.out.println(square.apply(7));

    }
}
