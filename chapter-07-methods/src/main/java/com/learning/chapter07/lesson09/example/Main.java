package com.learning.chapter07.lesson09.example;

/**
 * [Chapter 07. 메서드]
 * 09. 도전 - 전투 시스템 메서드로 리팩토링 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/470
 */

public class Main {

    public static int totalHp(int[] hp) {
        int total = 0;
        for (int i = 0; i < hp.length; i++) {
            total = total + hp[i];
        }
        return total;
    }

    public static int findBossIndex(int[] hp) {
        int bossIndex = 0;
        for (int i = 1; i < hp.length; i++) {
            if (hp[i] > hp[bossIndex]) {
                bossIndex = i;
            }
        }
        return bossIndex;
    }

    public static void attackMonster(int[] hp, int index, int damage) {
        hp[index] = hp[index] - damage;
    }

    public static void main(String[] args) {

        int[] hp = {20, 35, 50, 100, 15};

        System.out.println("전체 HP 합계: " + totalHp(hp));

        int bossIndex = findBossIndex(hp);
        System.out.println("보스 인덱스: " + bossIndex + " (HP " + hp[bossIndex] + ")");

        attackMonster(hp, bossIndex, 30);
        System.out.println("공격 후 보스 HP: " + hp[bossIndex]);

    }
}
