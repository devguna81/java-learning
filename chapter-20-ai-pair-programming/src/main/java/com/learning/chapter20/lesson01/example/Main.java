package com.learning.chapter20.lesson01.example;

/**
 * [Chapter 20. AI Pair Programming]
 * 01. 내가 먼저 생각하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/575
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character("전사", 1);
        warrior.showStatus();

    }
}

class Character {
    String name;
    int level;
    int exp;

    Character(String name, int level) {
        this.name = name;
        this.level = level;
        this.exp = 0;
    }

    void showStatus() {
        System.out.println(name + " - 레벨: " + level + ", 경험치: " + exp);
    }
}
