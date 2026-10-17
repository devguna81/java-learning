package com.learning.chapter13.lesson05.example;

/**
 * [Chapter 13. 파일 처리]
 * 05. 텍스트 파일 저장하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/525
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("log.txt");

        Files.writeString(path, "전사 로그인\n");
        Files.writeString(path, "마법사 로그인\n", StandardOpenOption.APPEND);

        String content = Files.readString(path);
        System.out.println(content);

    }
}
