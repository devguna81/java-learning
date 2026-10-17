package com.learning.chapter13.lesson04.mission;

/**
 * [Chapter 13. 파일 처리]
 * 04. 텍스트 파일 읽기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/524
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("note.txt");
        Files.writeString(path, "레벨업!");

        String content = Files.readString(path);
        System.out.println(content);

    }
}
