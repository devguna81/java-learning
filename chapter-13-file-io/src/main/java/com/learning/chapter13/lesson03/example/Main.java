package com.learning.chapter13.lesson03.example;

/**
 * [Chapter 13. 파일 처리]
 * 03. Files - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/523
 */

import java.nio.file.Path;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("scores.txt");

        System.out.println("파일 존재 여부: " + Files.exists(path));

    }
}
