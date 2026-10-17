package com.learning.chapter13.lesson02.mission;

/**
 * [Chapter 13. 파일 처리]
 * 02. Path - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/522
 */

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {

        Path path = Path.of("save/player.dat");

        System.out.println(path);
        System.out.println(path.getFileName());

    }
}
