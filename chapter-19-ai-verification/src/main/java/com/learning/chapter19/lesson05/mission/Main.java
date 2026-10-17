package com.learning.chapter19.lesson05.mission;

/**
 * [Chapter 19. AI 코드 검증]
 * 05. 오류 메시지 확인하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/573
 */

public class Main {

    public static void main(String[] args) {

        int[] scores = {10, 20, 30};
        int index = 3;

        if (index < scores.length) {
            System.out.println(scores[index]);
        } else {
            System.out.println("인덱스 " + index + "은(는) 유효하지 않습니다");
        }

    }
}
