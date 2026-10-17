package com.learning.adventure.game;

/**
 * 스켈레톤 궁수 몬스터.
 */
public class Skeleton extends Monster {
    public Skeleton() {
        super("해골 궁수", 25, 10, 50);
    }

    @Override
    public void attack(Player target) {
        System.out.println("🏹 " + name + "이(가) 날카로운 화살을 발사합니다!");
        target.takeDamage(power);
    }
}
