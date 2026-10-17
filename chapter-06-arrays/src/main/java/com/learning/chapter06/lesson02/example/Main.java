package com.learning.chapter06.lesson02.example;

/**
 * [Chapter 06. 배열]
 * 02. 배열 선언과 생성 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/454
 */

public class Main {

    public static void main(String[] args) {

        int[] hp = new int[5];

        System.out.println("배열 길이: " + hp.length);
        System.out.println("0번 인덱스 기본값: " + hp[0]);
        System.out.println("4번 인덱스 기본값: " + hp[4]);

        boolean[] isAlive = new boolean[3];
        System.out.println("boolean 배열 기본값: " + isAlive[0]);

    }
}
