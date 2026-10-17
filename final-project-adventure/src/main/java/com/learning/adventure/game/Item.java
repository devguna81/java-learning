package com.learning.adventure.game;

/**
 * 게임 내 소비 아이템.
 */
public class Item {
    private String name;
    private int healAmount;

    public Item(String name, int healAmount) {
        this.name = name;
        this.healAmount = healAmount;
    }

    public void use(Player player) {
        System.out.println("🧪 " + player.getName() + "이(가) " + name + "을(를) 복용합니다.");
        player.heal(healAmount);
    }

    public String getName() { return name; }
    public int getHealAmount() { return healAmount; }
}
