package com.learning.chapter06.lesson04.example;

/**
 * [Chapter 06. 배열]
 * 04. 배열과 for문 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/456
 */

public class Main {

    public static void main(String[] args) {

        int[] hp = {30, 25, 40, 15};

        for (int i = 0; i < hp.length; i++) {
            System.out.println(i + "번 몬스터 HP: " + hp[i]);
        }

        int total = 0;
        for (int i = 0; i < hp.length; i++) {
            total = total + hp[i];
        }
        System.out.println("HP 합계: " + total);

    }
}
