package com.learning.chapter08.lesson10.mission;

/**
 * [Chapter 08. 클래스와 객체]
 * 10. 도전 - 몬스터 클래스와 전투 시스템 - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/480
 */

public class Main {

    public static void main(String[] args) {

        Monster[] monsters = new Monster[2];
        monsters[0] = new Monster("1번 몬스터", 20);
        monsters[1] = new Monster("2번 몬스터", 20);

        int playerAttack = 25;

        for (int i = 0; i < monsters.length; i++) {
            if (!monsters[i].isAlive) {
                continue;
            }
            monsters[i].takeDamage(playerAttack);
        }

        boolean allDefeated = true;
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i].isAlive) {
                allDefeated = false;
            }
        }

        if (allDefeated) {
            System.out.println("승리!");
        }

    }
}

class Monster {
    String name;
    int hp;
    boolean isAlive;

    Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }

    void takeDamage(int damage) {
        hp = hp - damage;
        if (hp <= 0) {
            hp = 0;
            isAlive = false;
            System.out.println(name + "이(가) 쓰러졌습니다!");
        } else {
            System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다");
        }
    }
}
