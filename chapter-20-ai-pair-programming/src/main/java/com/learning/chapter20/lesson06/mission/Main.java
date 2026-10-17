package com.learning.chapter20.lesson06.mission;

/**
 * [Chapter 20. AI Pair Programming]
 * 06. 다시 실행하기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/580
 */

public class Main {

    public static void main(String[] args) {

        Hunter hunter = new Hunter();
        for (int i = 0; i < 10; i++) {
            hunter.recordKill();
        }

    }
}

class Hunter {
    int killCount;
    int gold;

    void recordKill() {
        killCount = killCount + 1;
        gold = gold + 10;
        if (killCount % 5 == 0) {
            System.out.println("몬스터 사냥꾼! (누적 골드: " + gold + ")");
        }
    }
}
