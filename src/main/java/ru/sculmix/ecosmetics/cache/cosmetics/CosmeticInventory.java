package ru.sculmix.ecosmetics.cache.cosmetics;

import org.bukkit.inventory.ItemStack;

public interface CosmeticInventory {
    ItemStack changeItem(ItemStack originalItem);
    void leftItem();

    ItemStack leftItemAndGet();

    ItemStack getCurrentItemSaved();
}
