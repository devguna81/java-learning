package com.learning.chapter04.lesson09.example;

/**
 * [Chapter 04. 조건문]
 * 09. 실습 - 캐릭터 HP 상태 판정 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/437
 */

public class Main {

    public static void main(String[] args) {

        int hp = 15;
        int maxHp = 100;

        String status;
        if (hp <= 0) {
            status = "사망";
        } else if (hp <= 20) {
            status = "위험";
        } else if (hp <= 50) {
            status = "주의";
        } else {
            status = "정상";
        }

        String action = switch (status) {
            case "사망" -> "게임 오버 화면으로 이동합니다";
            case "위험" -> "즉시 회복 아이템을 사용하세요";
            case "주의" -> "전투를 피하는 것이 좋습니다";
            default -> "안전하게 모험을 계속하세요";
        };

        System.out.println("체력: " + hp + "/" + maxHp);
        System.out.println("상태: " + status);
        System.out.println("권장 행동: " + action);

    }
}
