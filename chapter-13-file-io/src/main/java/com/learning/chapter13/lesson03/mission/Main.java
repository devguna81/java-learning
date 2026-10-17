package com.learning.chapter13.lesson03.mission;

/**
 * [Chapter 13. 파일 처리]
 * 03. Files - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/523
 */

import java.nio.file.Path;
import java.nio.file.Files;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("config.json");

        System.out.println("config.json 존재 여부: " + Files.exists(path));

    }
}
