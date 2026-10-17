package com.learning.chapter11.lesson09.mission;

/**
 * [Chapter 11. 문자열]
 * 09. 실습 - 게임 명령어 분석기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/510
 */

public class Main {

    public static void main(String[] args) {

        processCommand("사용 포션");
        processCommand("방어");

    }

    static void processCommand(String command) {
        String[] parts = command.split(" ");
        String action = parts[0];

        if (action.equals("사용")) {
            System.out.println(parts[1] + "을(를) 사용합니다");
        } else if (action.equals("방어")) {
            System.out.println("방어합니다");
        } else {
            System.out.println("알 수 없는 명령어입니다");
        }
    }
}
