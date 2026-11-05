package ru.college.i923v;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block ENERGY_CRYSTAL = Registry.register(
            Registries.BLOCK,
            Identifier.of("minecraft-mod-i9-23v", "energy_crystal"),
            new Block(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)
                    .strength(3.0f, 6.0f)
                    .luminance(state -> 8))
    );

    public static void initialize() {
    }
}