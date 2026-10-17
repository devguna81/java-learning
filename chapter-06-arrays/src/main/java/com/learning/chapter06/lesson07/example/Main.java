package com.learning.chapter06.lesson07.example;

/**
 * [Chapter 06. 배열]
 * 07. Arrays 유틸리티 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/459
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] hp = {30, 25, 40, 15};

        System.out.println("원본: " + Arrays.toString(hp));

        Arrays.sort(hp);
        System.out.println("정렬 후: " + Arrays.toString(hp));

        int[] filled = new int[4];
        Arrays.fill(filled, 100);
        System.out.println("채운 배열: " + Arrays.toString(filled));

    }
}
