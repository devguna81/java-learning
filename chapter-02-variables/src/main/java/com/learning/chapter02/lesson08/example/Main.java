package com.learning.chapter02.lesson08.example;

/**
 * [Chapter 02. 변수]
 * 08. 변수 값 변경하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/417
 */

public class Main {

    public static void main(String[] args) {

        int hp = 20;
        System.out.println("초기 체력: " + hp);

        hp -= 3;
        System.out.println("hp -= 3 후: " + hp);

        hp += 10;
        System.out.println("hp += 10 후: " + hp);

        hp *= 2;
        System.out.println("hp *= 2 후: " + hp);

    }
}
