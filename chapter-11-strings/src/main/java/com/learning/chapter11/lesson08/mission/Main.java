package com.learning.chapter11.lesson08.mission;

/**
 * [Chapter 11. 문자열]
 * 08. StringBuilder - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/509
 */

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("전사");
        sb.append(" vs ");
        sb.append("마법사");

        System.out.println(sb.toString());

    }
}
