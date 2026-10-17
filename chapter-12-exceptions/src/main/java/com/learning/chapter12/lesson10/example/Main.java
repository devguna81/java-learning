package com.learning.chapter12.lesson10.example;

/**
 * [Chapter 12. 예외와 오류]
 * 10. 실습 - 오류가 발생해도 종료되지 않는 계산기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/520
 */

public class Main {

    public static void main(String[] args) {

        int[] numerators = {100, 50, 80};
        int[] denominators = {5, 0, 4};

        for (int i = 0; i < numerators.length; i++) {
            try {
                int result = divide(numerators[i], denominators[i]);
                System.out.println(numerators[i] + " / " + denominators[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println(numerators[i] + " / " + denominators[i] + " = 계산할 수 없습니다");
            }
        }

        System.out.println("모든 계산이 끝났습니다");

    }

    static int divide(int a, int b) {
        return a / b;
    }
}
