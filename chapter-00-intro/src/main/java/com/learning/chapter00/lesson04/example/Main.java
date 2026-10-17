package com.learning.chapter00.lesson04.example;

/**
 * [Chapter 00. 개발자가 되어보자]
 * 04. Minecraft와 Java의 관계 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/615
 */

public class Main {

    public static void main(String[] args) {

        String name = "Steve";
        int hp = 20;

        System.out.println(name + "의 현재 체력: " + hp);

        hp = hp - 3;
        System.out.println("좀비에게 3 데미지를 받았습니다. 남은 체력: " + hp);

        hp = hp - 5;
        System.out.println("크리퍼에게 5 데미지를 받았습니다. 남은 체력: " + hp);

    }
}
