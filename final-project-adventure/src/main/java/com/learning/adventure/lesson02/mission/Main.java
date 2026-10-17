package com.learning.adventure.lesson02.mission;

/**
 * [Final Project. Java Adventure]
 * 02. 캐릭터 만들기 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/583
 */

public class Main {

    public static void main(String[] args) {

        Player mage = new Player("마법사");
        mage.showStatus();

    }
}

class Player {
    String name;
    int hp;
    int maxHp;
    int power;

    Player(String name) {
        this.name = name;
        this.hp = 100;
        this.maxHp = 100;
        this.power = 10;
    }

    void showStatus() {
        System.out.println(name + " - HP: " + hp + "/" + maxHp + ", 공격력: " + power);
    }
}
