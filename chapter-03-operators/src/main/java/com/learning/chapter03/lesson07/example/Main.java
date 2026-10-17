package com.learning.chapter03.lesson07.example;

/**
 * [Chapter 03. 연산자]
 * 07. 문자열 연결 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/426
 */

public class Main {

    public static void main(String[] args) {

        int attack = 15;
        int defense = 8;

        System.out.println("공격력+방어력: " + attack + defense);
        System.out.println("공격력+방어력(괄호): " + (attack + defense));

        String greeting = "안녕";
        greeting += "하세요, ";
        greeting += "Java!";
        System.out.println(greeting);

    }
}
