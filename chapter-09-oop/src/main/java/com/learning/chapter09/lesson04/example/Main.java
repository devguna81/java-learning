package com.learning.chapter09.lesson04.example;

/**
 * [Chapter 09. 객체지향 프로그래밍]
 * 04. Getter와 Setter - 예제 코드
 *
 * 블로그 원문: https://jqdom.com/blog/484
 */

public class Main {

    public static void main(String[] args) {

        Character mage = new Character("마법사", 80);
        System.out.println(mage.getName() + "의 HP: " + mage.getHp());

        mage.setName("대마법사");
        System.out.println("이름 변경 후: " + mage.getName());

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

    public void setName(String newName) {
        if (newName == null || newName.isEmpty()) {
            System.out.println("이름은 비어있을 수 없습니다");
            return;
        }
        name = newName;
    }
}
