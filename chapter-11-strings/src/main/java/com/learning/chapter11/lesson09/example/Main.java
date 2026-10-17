package com.learning.chapter11.lesson09.example;

/**
 * [Chapter 11. 문자열]
 * 09. 실습 - 게임 명령어 분석기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/510
 */

public class Main {

    public static void main(String[] args) {

        processCommand("공격 좀비");
        processCommand("이동 북쪽");
        processCommand("점프");

    }

    static void processCommand(String command) {
        String[] parts = command.split(" ");
        String action = parts[0];

        if (action.equals("공격")) {
            System.out.println(parts[1] + "을(를) 공격합니다");
        } else if (action.equals("이동")) {
            System.out.println(parts[1] + "(으)로 이동합니다");
        } else if (action.equals("점프")) {
            System.out.println("점프합니다");
        } else {
            System.out.println("알 수 없는 명령어입니다");
        }
    }
}
