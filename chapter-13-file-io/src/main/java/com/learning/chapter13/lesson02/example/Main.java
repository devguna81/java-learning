package com.learning.chapter13.lesson02.example;

/**
 * [Chapter 13. 파일 처리]
 * 02. Path - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/522
 */

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("data/scores.txt");

        System.out.println(path);
        System.out.println(path.getFileName());

    }
}
