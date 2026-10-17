package com.learning.chapter10.lesson05.example;

/**
 * [Chapter 10. Collection]
 * 05. HashSet - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/496
 */

import java.util.Set;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        Set<String> defeated = new HashSet<>();
        defeated.add("좀비");
        defeated.add("좀비");
        defeated.add("스켈레톤");

        System.out.println("처치한 몬스터 종류 수: " + defeated.size());
        System.out.println("좀비 포함 여부: " + defeated.contains("좀비"));
        System.out.println("크리퍼 포함 여부: " + defeated.contains("크리퍼"));

    }
}
