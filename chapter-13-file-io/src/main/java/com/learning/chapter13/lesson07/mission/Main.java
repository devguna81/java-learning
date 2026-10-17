package com.learning.chapter13.lesson07.mission;

/**
 * [Chapter 13. 파일 처리]
 * 07. JSON이란? - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/527
 */

import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        String json = "{\"name\":\"몬스터\",\"hp\":50,\"exp\":30}";

        Path path = Path.of("monster.json");
        Files.writeString(path, json);

        String content = Files.readString(path);
        System.out.println(content);

    }
}
