package com.learning.chapter10.lesson04.mission;

/**
 * [Chapter 10. Collection]
 * 04. Set - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/495
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> defeated = new ArrayList<>();
        defeated.add("스켈레톤");
        defeated.add("스켈레톤");
        defeated.add("크리퍼");

        System.out.println("기록된 개수: " + defeated.size());

    }
}
