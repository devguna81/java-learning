package com.learning.chapter20.lesson05.example;

/**
 * [Chapter 20. AI Pair Programming]
 * 05. 직접 수정하기 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/579
 */

public class Main {

    public static void main(String[] args) {

        Character warrior = new Character("전사", 1);
        warrior.gainExp(60);
        warrior.gainExp(60);
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

    void gainExp(int amount) {
        exp = exp + amount;
        if (exp >= 100) {
            exp = exp - 100;
            level = level + 1;
        }
    }

    void showStatus() {
        System.out.println(name + " - 레벨: " + level + ", 경험치: " + exp);
    }
}
