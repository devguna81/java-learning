package com.learning.chapter06.lesson07.mission;

/**
 * [Chapter 06. 배열]
 * 07. Arrays 유틸리티 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/459
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {40, 10, 30, 20};

        System.out.println("정렬 전: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("정렬 후: " + Arrays.toString(numbers));

    }
}
