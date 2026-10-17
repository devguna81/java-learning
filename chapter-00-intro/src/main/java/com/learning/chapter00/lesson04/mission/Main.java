package com.learning.chapter00.lesson04.mission;

/**
 * [Chapter 00. 개발자가 되어보자]
 * 04. Minecraft와 Java의 관계 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/615
 */

public class Main {

    public static void main(String[] args) {

        String name = "Alex";
        int hp = 12;

        System.out.println(name + "의 현재 체력: " + hp);

        hp = hp + 6;
        System.out.println("포션을 마셨습니다. 회복된 체력: " + hp);

    }
}
