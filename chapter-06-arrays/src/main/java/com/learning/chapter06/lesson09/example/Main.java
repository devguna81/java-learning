package com.learning.chapter06.lesson09.example;

/**
 * [Chapter 06. 배열]
 * 09. 도전 - 몬스터 리스트 관리하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/461
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = {"슬라임", "고블린", "오크", "드래곤", "박쥐"};
        int[] hp = {20, 35, 50, 100, 0};

        int total = 0;
        int maxHp = hp[0];
        String bossName = names[0];

        for (int i = 0; i < names.length; i++) {

            if (hp[i] <= 0) {
                System.out.println(names[i] + ": 처치됨");
                continue;
            }

            total = total + hp[i];

            if (hp[i] > maxHp) {
                maxHp = hp[i];
                bossName = names[i];
            }

            System.out.println(names[i] + ": HP " + hp[i]);
        }

        System.out.println("전체 HP 합계: " + total);
        System.out.println("보스 후보: " + bossName + " (HP " + maxHp + ")");
        System.out.println("이름 목록: " + Arrays.toString(names));

    }
}
