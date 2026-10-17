package com.learning.chapter04.lesson03.mission;

/**
 * [Chapter 04. 조건문]
 * 03. else - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/431
 */

public class Main {

    public static void main(String[] args) {

        boolean isPasswordCorrect = false;

        System.out.println("입력한 비밀번호가 맞습니까? " + isPasswordCorrect);

        if (isPasswordCorrect) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패: 비밀번호를 확인해 주세요");
        }

    }
}
