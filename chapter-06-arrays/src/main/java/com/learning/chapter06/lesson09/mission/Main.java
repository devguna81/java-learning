package com.learning.chapter06.lesson09.mission;

/**
 * [Chapter 06. 배열]
 * 09. 도전 - 몬스터 리스트 관리하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/461
 */

public class Main {

    public static void main(String[] args) {

        String[] names = {"철수", "영희", "민수"};
        int[] scores = {85, 92, 78};

        int total = 0;
        int maxScore = scores[0];
        String topStudent = names[0];

        for (int i = 0; i < names.length; i++) {
            total = total + scores[i];
            if (scores[i] > maxScore) {
                maxScore = scores[i];
                topStudent = names[i];
            }
        }

        double average = (double) total / scores.length;

        System.out.println("평균: " + average);
        System.out.println("최고 점수 학생: " + topStudent + " (" + maxScore + "점)");

    }
}
