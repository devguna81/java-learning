package com.learning.chapter04.lesson04.example;

/**
 * [Chapter 04. 조건문]
 * 04. else if - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/432
 */

public class Main {

    public static void main(String[] args) {

        int score = 85;

        if (score >= 90) {
            System.out.println("등급: S");
        } else if (score >= 70) {
            System.out.println("등급: A");
        } else if (score >= 50) {
            System.out.println("등급: B");
        } else {
            System.out.println("등급: C");
        }

    }
}
