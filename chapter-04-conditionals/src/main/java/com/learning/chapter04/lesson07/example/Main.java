package com.learning.chapter04.lesson07.example;

/**
 * [Chapter 04. 조건문]
 * 07. switch - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/435
 */

public class Main {

    public static void main(String[] args) {

        char rank = 'B';

        switch (rank) {
            case 'S':
                System.out.println("최고 등급입니다");
                break;
            case 'A':
                System.out.println("상급입니다");
                break;
            case 'B':
                System.out.println("중급입니다");
                break;
            default:
                System.out.println("등급 정보가 없습니다");
        }

    }
}
