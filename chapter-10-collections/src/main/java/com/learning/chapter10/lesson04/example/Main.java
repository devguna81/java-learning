package com.learning.chapter10.lesson04.example;

/**
 * [Chapter 10. Collection]
 * 04. Set - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/495
 */

import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        List<String> defeated = new ArrayList<>();
        defeated.add("좀비");
        defeated.add("좀비");
        defeated.add("스켈레톤");

        System.out.println("기록된 개수: " + defeated.size());

    }
}
