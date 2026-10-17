package com.learning.chapter06.lesson06.example;

/**
 * [Chapter 06. 배열]
 * 06. 배열 복사 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/458
 */

public class Main {

    public static void main(String[] args) {

        int[] hp = {30, 25, 40};

        int[] sameArray = hp;
        sameArray[0] = 100;
        System.out.println("hp[0] (같이 가리키는 경우): " + hp[0]);

        int[] realCopy = new int[hp.length];
        System.arraycopy(hp, 0, realCopy, 0, hp.length);
        realCopy[1] = 999;
        System.out.println("hp[1] (진짜 복사한 경우): " + hp[1]);
        System.out.println("realCopy[1]: " + realCopy[1]);

    }
}
