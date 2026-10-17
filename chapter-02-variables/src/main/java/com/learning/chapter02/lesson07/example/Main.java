package com.learning.chapter02.lesson07.example;

/**
 * [Chapter 02. 변수]
 * 07. String - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/416
 */

public class Main {

    public static void main(String[] args) {

        String name1 = "Steve";
        String name2 = "Steve";

        boolean sameByEquals = name1.equals(name2);
        boolean sameByDoubleEqual = (name1 == name2);

        System.out.println("equals() 결과: " + sameByEquals);
        System.out.println("== 결과: " + sameByDoubleEqual);

    }
}
