package com.learning.chapter20.lesson02.mission;

/**
 * [Chapter 20. AI Pair Programming]
 * 02. 직접 코드 작성하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/576
 */

public class Main {

    public static void main(String[] args) {

        Hunter hunter = new Hunter();
        hunter.recordKill();
        hunter.recordKill();
        hunter.recordKill();
        hunter.recordKill();
        hunter.recordKill();

    }
}

class Hunter {
    int killCount;

    void recordKill() {
        killCount = killCount + 1;
        if (killCount % 5 == 0) {
            System.out.println("몬스터 사냥꾼!");
        }
    }
}
