package com.learning.chapter08.lesson08.example;

/**
 * [Chapter 08. 클래스와 객체]
 * 08. 객체 배열 - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/478
 */

public class Main {

    public static void main(String[] args) {

        Character[] party = new Character[3];
        party[0] = new Character("전사", 100);
        party[1] = new Character("마법사", 70);
        party[2] = new Character("궁수", 80);

        for (int i = 0; i < party.length; i++) {
            party[i].showInfo();
        }

    }
}

class Character {
    String name;
    int hp;

    Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    void showInfo() {
        System.out.println(name + "의 HP: " + hp);
    }
}
