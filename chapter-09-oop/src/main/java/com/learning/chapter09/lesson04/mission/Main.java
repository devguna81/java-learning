package com.learning.chapter09.lesson04.mission;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 04. Getter와 Setter - 실습 미션 모범 답안
 *
 * 블로그 원문: https://jqdom.com/blog/484
 */

public class Main {

    public static void main(String[] args) {

        Character archer = new Character("궁수", 60);
        archer.setHp(150);
        System.out.println(archer.getName() + "의 HP: " + archer.getHp());

    }
}

class Character {
    private String name;
    private int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int newHp) {
        if (newHp > 100) {
            hp = 100;
        } else if (newHp < 0) {
            hp = 0;
        } else {
            hp = newHp;
        }
    }
}
