package com.learning.chapter06.lesson01.mission;

/**
 * [Chapter 06. 배열]
 * 01. 배열이 필요한 이유 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/453
 */

public class Main {

    public static void main(String[] args) {

        int hp1 = 35;
        int hp2 = 20;
        int hp3 = 45;
        int hp4 = 15;

        int min = hp1;
        if (hp2 < min) {
            min = hp2;
        }
        if (hp3 < min) {
            min = hp3;
        }
        if (hp4 < min) {
            min = hp4;
        }

        System.out.println("가장 낮은 HP: " + min);

    }
}
