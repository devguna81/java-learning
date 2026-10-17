package com.learning.chapter07.lesson06.example;

/**
 * [Chapter 07. 메서드]
 * 06. 메서드와 배열 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/467
 */

public class Main {

    public static int sum(int[] numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        return total;
    }

    public static void doubleAll(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }
    }

    public static void main(String[] args) {

        int[] hp = {10, 20, 30};

        System.out.println("합계: " + sum(hp));

        doubleAll(hp);
        System.out.println("두 배로 만든 후 0번 값: " + hp[0]);

    }
}
