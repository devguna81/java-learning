package com.learning.chapter02.lesson01.example;

/**
 * [Chapter 02. 변수]
 * 01. 변수란 무엇인가? - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/410
 */

public class Main {

    public static void main(String[] args) {

        int hp = 20;
        System.out.println("초기 체력: " + hp);

        System.out.println("체력에 5를 더하면: " + (hp + 5));
        System.out.println("hp 자체는 그대로: " + hp);

        hp = hp - 3;
        System.out.println("데미지를 받은 후 체력: " + hp);

    }
}
