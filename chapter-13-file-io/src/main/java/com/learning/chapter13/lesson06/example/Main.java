package com.learning.chapter13.lesson06.example;

/**
 * [Chapter 13. 파일 처리]
 * 06. CSV란? - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/526
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("scores.csv");
        Files.writeString(path, "전사,100\n마법사,80\n");

        String content = Files.readString(path);
        String[] lines = content.split("\n");

        for (int i = 0; i < lines.length; i++) {
            String[] fields = lines[i].split(",");
            System.out.println(fields[0] + "의 점수: " + fields[1]);
        }

    }
}
