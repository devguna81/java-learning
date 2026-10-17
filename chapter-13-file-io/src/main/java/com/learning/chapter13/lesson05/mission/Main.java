package com.learning.chapter13.lesson05.mission;

/**
 * [Chapter 13. 파일 처리]
 * 05. 텍스트 파일 저장하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/525
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("chat.txt");

        Files.writeString(path, "전사: 안녕\n");
        Files.writeString(path, "마법사: 반가워\n", StandardOpenOption.APPEND);

        String content = Files.readString(path);
        System.out.println(content);

    }
}
