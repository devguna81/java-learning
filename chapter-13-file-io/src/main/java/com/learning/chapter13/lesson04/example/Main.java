package com.learning.chapter13.lesson04.example;

/**
 * [Chapter 13. 파일 처리]
 * 04. 텍스트 파일 읽기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/524
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("scores.txt");
        Files.writeString(path, "전사 100\n마법사 80");

        String content = Files.readString(path);
        System.out.println(content);

    }
}
