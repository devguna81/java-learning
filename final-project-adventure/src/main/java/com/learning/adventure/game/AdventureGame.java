package com.learning.adventure.game;

import java.util.ArrayList;
import java.util.List;

/**
 * [Final Project. Java Adventure]
 * 완성형 콘솔 텍스트 RPG 메인 게임 루프.
 *
 * 블로그 원문: https://jqdom.com/blog/591
 */
public class AdventureGame {

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("⚔️  [Final Project] Java Adventure Text RPG 시작! ⚔️");
        System.out.println("==================================================");

        Player hero = new Player("용사 아서");
        Inventory inventory = new Inventory();
        Item healthPotion = new Item("체력 포션", 30);

        inventory.addItem(healthPotion.getName(), 3);
        hero.showStatus();

        List<Monster> dungeonMonsters = new ArrayList<>();
        dungeonMonsters.add(new Zombie());
        dungeonMonsters.add(new Skeleton());
        dungeonMonsters.add(new Zombie());
        dungeonMonsters.add(new Boss());

        System.out.println("\n던전에 입장합니다! 총 " + dungeonMonsters.size() + "마리의 몬스터가 도사리고 있습니다.\n");

        for (int i = 0; i < dungeonMonsters.size(); i++) {
            Monster monster = dungeonMonsters.get(i);
            boolean victory = battle(hero, monster);

            if (!victory) {
                System.out.println("\n💀 용사가 쓰러져 모험이 실패로 끝났습니다...");
                return;
            }

            // 전투 후 체력이 절반 이하이고 포션이 있으면 자동 회복
            if (hero.getHp() < hero.getMaxHp() / 2 && inventory.hasItem(healthPotion.getName())) {
                System.out.println("\n⚠️ 체력이 위험합니다! 포션을 복용합니다.");
                inventory.useItem(healthPotion.getName(), hero, healthPotion);
                hero.showStatus();
            }

            System.out.println("--------------------------------------------------");
        }

        System.out.println("\n🎉 축하합니다! 모든 몬스터를 격퇴하고 세상을 구했습니다! 🎉");
        hero.showStatus();
        System.out.println("=== " + hero.getName() + "의 전설적인 모험 완료 ===");
    }

    private static boolean battle(Player player, Monster monster) {
        System.out.println("\n💥 [" + monster.getName() + "] 와(과)의 치열한 전투가 시작되었습니다!");

        int round = 1;
        while (player.isAlive() && monster.isAlive()) {
            System.out.println("\n[Round " + round++ + "]");
            player.attack(monster);

            if (!monster.isAlive()) {
                break;
            }

            monster.attack(player);
        }

        if (player.isAlive()) {
            System.out.println("\n🏆 " + monster.getName() + "을(를) 완벽히 제압했습니다!");
            player.gainExp(monster.getExpReward());
            player.showStatus();
            return true;
        } else {
            return false;
        }
    }
}
