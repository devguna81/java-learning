package com.learning.chapter14.lesson02.example;

/**
 * [Chapter 14. Modern Java]
 * 02. Record - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/530
 */

public class Main {

    public static void main(String[] args) {

        Player player = new Player("전사", 100);
        System.out.println(player.name() + " - HP: " + player.hp());
        System.out.println(player);

    }
}

final class Player {
    private final String name;
    private final int hp;

    Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    String name() {
        return name;
    }

    int hp() {
        return hp;
    }

    @Override
    public String toString() {
        return "Player[name=" + name + ", hp=" + hp + "]";
    }
}
