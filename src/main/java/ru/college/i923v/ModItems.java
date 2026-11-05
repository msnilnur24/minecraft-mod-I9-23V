package ru.college.i923v;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ENERGY_CRYSTAL = Registry.register(
            Registries.ITEM,
            Identifier.of("minecraft-mod-i9-23v", "energy_crystal"),
            new BlockItem(ModBlocks.ENERGY_CRYSTAL, new Item.Settings())
    );

    public static void initialize() {
    }
}