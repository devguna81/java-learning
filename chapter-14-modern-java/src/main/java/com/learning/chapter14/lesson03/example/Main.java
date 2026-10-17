package com.learning.chapter14.lesson03.example;

/**
 * [Chapter 14. Modern Java]
 * 03. Lambda - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/531
 */

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<Integer, Integer> doubleValue = (n) -> n * 2;

        System.out.println(doubleValue.apply(10));
        System.out.println(doubleValue.apply(25));

    }
}
