package com.learning.chapter03.lesson02.mission;

/**
 * [Chapter 03. 연산자]
 * 02. 덧셈, 뺄셈, 곱셈, 나눗셈 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/421
 */

public class Main {

    public static void main(String[] args) {

        int totalExp = 250;
        int partyMembers = 4;

        int intResult = totalExp / partyMembers;
        double preciseResult = (double) totalExp / partyMembers;

        System.out.println("총 경험치: " + totalExp);
        System.out.println("파티원 수: " + partyMembers);
        System.out.println("1인당 경험치(정수): " + intResult);
        System.out.println("1인당 경험치(정확한 값): " + preciseResult);

    }
}
