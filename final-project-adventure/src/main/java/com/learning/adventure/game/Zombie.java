package com.learning.adventure.game;

/**
 * 좀비 몬스터.
 */
public class Zombie extends Monster {
    public Zombie() {
        super("썩은 좀비", 30, 8, 60);
    }

    @Override
    public void attack(Player target) {
        System.out.println("🧟 " + name + "이(가) 거친 팔을 휘둘러 공격합니다!");
        target.takeDamage(power);
    }
}
