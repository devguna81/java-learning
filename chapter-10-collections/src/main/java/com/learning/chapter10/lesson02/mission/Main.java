package com.learning.chapter10.lesson02.mission;

/**
 * [Chapter 10. Collection]
 * 02. List - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/493
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> party = new ArrayList<>();
        party.add("전사");
        party.add("마법사");
        party.add("궁수");

        System.out.println("파티원 수: " + party.size());
        System.out.println(party.get(2));

    }
}
