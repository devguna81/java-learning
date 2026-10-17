package com.learning.chapter02.lesson04.example;

/**
 * [Chapter 02. 변수]
 * 04. double - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/413
 */

public class Main {

    public static void main(String[] args) {

        double speed = 1.5;
        int seconds = 4;

        double distance = speed * seconds;
        System.out.println("이동 속도: " + speed + " 칸/초");
        System.out.println(seconds + "초 동안 이동한 거리: " + distance + " 칸");

    }
}
