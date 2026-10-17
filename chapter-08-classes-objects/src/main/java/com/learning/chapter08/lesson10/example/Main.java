package com.learning.chapter08.lesson10.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 10. 도전 - 몬스터 클래스와 전투 시스템 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/480
 */

public class Main {

    public static void main(String[] args) {

        Monster[] monsters = new Monster[3];
        monsters[0] = new Monster("슬라임", 15);
        monsters[1] = new Monster("고블린", 30);
        monsters[2] = new Monster("오크", 50);

        int playerAttack = 20;

        for (int i = 0; i < monsters.length; i++) {

            if (!monsters[i].isAlive) {
                System.out.println(monsters[i].name + "은(는) 이미 쓰러진 상태입니다");
                continue;
            }

            monsters[i].takeDamage(playerAttack);
        }

        System.out.println("=== 전투 결과 ===");
        for (int i = 0; i < monsters.length; i++) {
            monsters[i].showStatus();
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

    void showStatus() {
        System.out.println(name + " - HP: " + hp + ", 생존: " + isAlive);
    }
}
