package com.learning.adventure.game;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 플레이어의 소지품 가방(인벤토리).
 */
public class Inventory {
    private final Map<String, Integer> itemCounts = new HashMap<>();

    public void addItem(String itemName, int count) {
        itemCounts.put(itemName, itemCounts.getOrDefault(itemName, 0) + count);
        System.out.println("🎒 [" + itemName + "] " + count + "개를 인벤토리에 넣었습니다. (보유량: " + itemCounts.get(itemName) + ")");
    }

    public boolean hasItem(String itemName) {
        return itemCounts.getOrDefault(itemName, 0) > 0;
    }

    public boolean useItem(String itemName, Player player, Item item) {
        if (!hasItem(itemName)) {
            System.out.println("❌ " + itemName + "이(가) 인벤토리에 없습니다.");
            return false;
        }

        itemCounts.put(itemName, itemCounts.get(itemName) - 1);
        item.use(player);
        System.out.println("🎒 남은 " + itemName + ": " + itemCounts.get(itemName) + "개");
        return true;
    }

    public Map<String, Integer> getItems() {
        return Collections.unmodifiableMap(itemCounts);
    }
}
