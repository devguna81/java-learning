package com.learning.chapter14.lesson01.mission;

/**
 * [Chapter 14. Modern Java]
 * 01. var - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/529
 */

public class Main {

    public static void main(String[] args) {

        var title = "전사";
        var level = 5;
        var isAlive = true;

        System.out.println(title + " (레벨 " + level + ", 생존: " + isAlive + ")");

    }
}
