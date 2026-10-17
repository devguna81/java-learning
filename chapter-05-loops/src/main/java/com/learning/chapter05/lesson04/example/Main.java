package com.learning.chapter05.lesson04.example;

/**
 * [Chapter 05. 반복문]
 * 04. do-while - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/442
 */

public class Main {

    public static void main(String[] args) {

        int count = 1;

        do {
            System.out.println(count + "번째 시도");
            count = count + 1;
        } while (count <= 3);

        System.out.println("시도가 끝났습니다");

    }
}
