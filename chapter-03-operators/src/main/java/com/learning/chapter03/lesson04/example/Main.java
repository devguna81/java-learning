package com.learning.chapter03.lesson04.example;

/**
 * [Chapter 03. 연산자]
 * 04. 증가와 감소 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/423
 */

public class Main {

    public static void main(String[] args) {

        int a = 5;
        int postResult = a++;
        System.out.println("후위형 사용 후 postResult: " + postResult);
        System.out.println("후위형 사용 후 a: " + a);

        int b = 5;
        int preResult = ++b;
        System.out.println("전위형 사용 후 preResult: " + preResult);
        System.out.println("전위형 사용 후 b: " + b);

    }
}
