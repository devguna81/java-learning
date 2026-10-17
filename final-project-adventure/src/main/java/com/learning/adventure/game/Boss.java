package com.learning.adventure.game;

/**
 * 던전 보스 몬스터.
 */
public class Boss extends Monster {
    public Boss() {
        super("지옥의 군주 드래곤", 80, 15, 200);
    }

    @Override
    public void attack(Player target) {
        System.out.println("🔥 " + name + "이(가) 지옥의 화염 숨결을 내뿜습니다!");
        target.takeDamage(power);
    }
}
