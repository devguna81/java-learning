package com.learning.chapter04.lesson09.mission;

/**
 * [Chapter 04. 조건문]
 * 09. 실습 - 캐릭터 HP 상태 판정 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/437
 */

public class Main {

    public static void main(String[] args) {

        int mana = 8;
        int maxMana = 100;

        String status;
        if (mana <= 10) {
            status = "고갈";
        } else if (mana <= 40) {
            status = "부족";
        } else {
            status = "충분";
        }

        String action = switch (status) {
            case "고갈" -> "마나 포션을 마시세요";
            case "부족" -> "마나 회복 스킬을 아껴 쓰세요";
            default -> "마음껏 스킬을 사용하세요";
        };

        System.out.println("마나: " + mana + "/" + maxMana);
        System.out.println("상태: " + status);
        System.out.println("권장 행동: " + action);

    }
}
