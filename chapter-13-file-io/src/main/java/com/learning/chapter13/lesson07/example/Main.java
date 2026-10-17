package com.learning.chapter13.lesson07.example;

/**
 * [Chapter 13. 파일 처리]
 * 07. JSON이란? - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/527
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String json = "{\"name\":\"전사\",\"hp\":100,\"level\":5}";

        Path path = Path.of("player.json");
        Files.writeString(path, json);

        String content = Files.readString(path);
        System.out.println(content);

    }
}
